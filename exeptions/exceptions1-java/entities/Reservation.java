package model.entities;
// Paquete donde se encuentra la clase Reservation (entidad del modelo)

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
// Importa clases para trabajar con fechas y para calcular diferencias de tiempo

import model.exceptions.DomainException;
// Importa una excepción personalizada del proyecto

public class Reservation {
	// Clase que representa una reserva de habitación en un hotel

	private Integer roomNumber;  // Número de la habitación
	private Date checkIn;        // Fecha de entrada
	private Date checkOut;       // Fecha de salida
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	// Formato de fecha usado para mostrar las fechas en texto

	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
		// Constructor que recibe los datos de la reserva

		if (!checkOut.after(checkIn)) {
			// Si la fecha de salida no es posterior a la de entrada → error
			throw new DomainException("Check-out date must be after check-in date");
		}
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber; // Devuelve el número de habitación
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber; // Cambia el número de habitación
	}

	public Date getCheckIn() {
		return checkIn; // Devuelve la fecha de entrada
	}

	public Date getCheckOut() {
		return checkOut; // Devuelve la fecha de salida
	}

	public long duration() {
		// Calcula la duración de la reserva en días
		long diff = checkOut.getTime() - checkIn.getTime(); // Diferencia en milisegundos
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS); // Convierte a días
	}
	
	public void updateDates(Date checkIn, Date checkOut) {
		// Actualiza las fechas de la reserva (si son válidas)
		Date now = new Date(); // Fecha actual

		if (checkIn.before(now) || checkOut.before(now)) {
			// Si alguna de las fechas es anterior a hoy → error
			throw new DomainException("Reservation dates for update must be future dates");
		}
		if (!checkOut.after(checkIn)) {
			// Si la fecha de salida no es después de la entrada → error
			throw new DomainException("Check-out date must be after check-in date");
		}
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	@Override
	public String toString() {
		// Devuelve un texto legible con la información de la reserva
		return "Room "
			+ roomNumber
			+ ", check-in: " + sdf.format(checkIn)
			+ ", check-out: " + sdf.format(checkOut)
			+ ", " + duration() + " nights";
	}
}
