package entities; // Define el paquete donde está la clase

import exceptions.BusinessException; // Importa una clase de excepción personalizada

// Clase que representa una cuenta bancaria
public class Account {

	private Integer number;         // Número de cuenta
	private String holder;          // Titular de la cuenta
	private Double balance;         // Saldo actual
	private Double withdrawLimit;   // Límite máximo de retiro

	// Constructor vacío
	public Account() {
	}

	// Constructor con todos los atributos
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	// Métodos getters y setters (acceso y modificación de atributos)
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	// Método para depositar dinero
	public void deposit(double amount) {
		balance += amount;
	}
	
	// Método para retirar dinero
	public void withdraw(double amount) {
		validateWithdraw(amount); // Verifica si el retiro es válido
		balance -= amount;        // Descuenta el monto del saldo
	}
	
	// Método privado que valida las condiciones de retiro
	private void validateWithdraw(double amount) {
		if (amount > getWithdrawLimit()) {
			// Si el monto excede el límite permitido, lanza un error
			throw new BusinessException("Error de retiro: la cantidad excede el límite de retiro");
		} 
		if (amount > getBalance()) {
			// Si el monto es mayor que el saldo disponible, lanza otro error
			throw new BusinessException("Error de retiro: saldo insuficiente");
		}
	}
}
