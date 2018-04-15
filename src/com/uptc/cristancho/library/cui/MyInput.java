package com.uptc.cristancho.library.cui;

import java.util.Scanner;

/**
 * Clase MyInput, encargada de proporcionarle al usuario la escritura por
 * teclado Fecha: 01/03/2018
 * 
 * @author Fabian Alejandro Cristancho Rincon
 *
 */

public class MyInput {
	private Scanner scanner;

	/**
	 * Constructor que inicializa el objeto scanner
	 */

	public MyInput() {
		this.scanner = new Scanner(System.in);
	}

	/**
	 * Obtiene el caracter de la opcion digitada por el usuario
	 * 
	 * @return Caracter proporcionado
	 */

	public char getOption() {
		return scanner.nextLine().charAt(0);
	}

	/**
	 * Obtiene el caracter digitado por el usuario y muestra un mensaje de
	 * indicacion
	 * 
	 * @param message
	 *            Mensaje mostrado con el fin de guiar al usuario
	 * @return Caracter proporcionado
	 */

	public char readChar(String message) {
		System.out.println(message);
		return scanner.nextLine().charAt(0);
	}

	/**
	 * Muestra un mensaje de indicacion y lee un double proporcionado por el usuario
	 * 
	 * @param message
	 *            Mensaje proporcionado para guiar al usuario
	 * @return Valor double establecido
	 */

	public double readDouble(String message) {
		System.out.println(message);
		return scanner.nextDouble();
	}
	
	/**
	 * Lee un double proporcionado por el usuario
	 * @return Double convertido
	 * @throws NumberFormatException Excepcion en caso de que no se almacene un double
	 */
	public double readDouble() throws NumberFormatException {
		return Double.parseDouble(scanner.nextLine());
	}
	
	public String getString() {
		return scanner.nextLine();
	}

}
