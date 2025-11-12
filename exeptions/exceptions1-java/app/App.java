package app;  
// Paquete donde está el programa principal

import java.text.ParseException;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.Scanner;  
// Importa clases necesarias: para fechas, formato y lectura de datos

import model.entities.Reservation;  
import model.exceptions.DomainException;  
// Importa clases del proyecto: la reserva y una excepción personalizada

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);  
		// Objeto para leer datos del usuario por consola

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");  
		// Define el formato que se usará para leer las fechas (día/mes/año)
		
		try {
			// Bloque try: aquí va el código que puede generar excepciones

			System.out.print("Room number: ");  
			int number = sc.nextInt();  
			// Pide el número de habitación

			System.out.print("Check-in date (dd/MM/yyyy): ");  
			Date checkIn = sdf.parse(sc.next());  
			// Lee y convierte la fecha de entrada

			System.out.print("Check-out date (dd/MM/yyyy): ");  
			Date checkOut = sdf.parse(sc.next());  
			// Lee y convierte la fecha de salida
			
			Reservation reservation = new Reservation(number, checkIn, checkOut);  
			// Crea una nueva reserva con los datos ingresados

			System.out.println("Reservation: " + reservation);  
			// Muestra los datos de la reserva creada
			
			System.out.println();
			System.out.println("Enter data to update the reservation:");  
			// Pide al usuario nuevos datos para actualizar la reserva

			System.out.print("Check-in date (dd/MM/yyyy): ");  
			checkIn = sdf.parse(sc.next());  
			// Nueva fecha de entrada

			System.out.print("Check-out date (dd/MM/yyyy): ");  
			checkOut = sdf.parse(sc.next());  
			// Nueva fecha de salida
			
			reservation.updateDates(checkIn, checkOut);  
			// Actualiza las fechas de la reserva

			System.out.println("Reservation: " + reservation);  
			// Muestra la reserva actualizada
		}
		catch (ParseException e) {
			// Se ejecuta si el formato de la fecha es incorrecto
			System.out.println("Invalid date format");
		}
		catch (DomainException e) {
			// Se ejecuta si hay un error en la lógica de la reserva (ej. fechas inválidas)
			System.out.println("Error in reservation: " + e.getMessage());
		}
		catch (RuntimeException e) {
			// Se ejecuta si ocurre cualquier otro error inesperado
			System.out.println("Unexpected error");
		}

		sc.close();  
		// Cierra el objeto Scanner
	}
}
