package app;
// Paquete principal donde se ejecuta el programa

import java.util.Locale;
import java.util.Scanner;
// Importa clases para configuración regional y lectura de datos

import entities.Account;
import exceptions.BusinessException;
// Importa las clases del proyecto: la cuenta y la excepción personalizada

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		// Define el formato numérico como el de Estados Unidos (punto decimal)

		Scanner sc = new Scanner(System.in);
		// Crea un objeto Scanner para leer datos del teclado

		System.out.println("Informe os dados da conta");
		// Muestra mensaje inicial para ingresar los datos de la cuenta

		System.out.print("Numero: ");
		int number = sc.nextInt();
		// Pide y guarda el número de la cuenta

		System.out.print("Titular: ");
		sc.nextLine(); // Limpia el buffer del teclado
		String holder = sc.nextLine();
		// Pide y guarda el nombre del titular

		System.out.print("Saldo inicial: ");
		double balance = sc.nextDouble();
		// Pide y guarda el saldo inicial

		System.out.print("Limite de saque: ");
		double withdrawLimit = sc.nextDouble();
		// Pide y guarda el límite máximo para sacar dinero

		Account acc = new Account(number, holder, balance, withdrawLimit);
		// Crea un objeto Account con los datos ingresados
		
		System.out.println();
		System.out.print("Informe uma quantia para sacar: ");
		double amount = sc.nextDouble();
		// Pide el valor que el usuario desea sacar
		
		try {
			acc.withdraw(amount);
			// Intenta realizar el saque

			System.out.printf("Novo saldo: %.2f%n", acc.getBalance());
			// Muestra el nuevo saldo si el saque fue exitoso
		}
		catch (BusinessException e) {
			// Captura y muestra el mensaje de error si algo sale mal
			System.out.println(e.getMessage());
		}
		
		sc.close();
		// Cierra el Scanner (buena práctica)
	}

}
