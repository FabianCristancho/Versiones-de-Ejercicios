package com.uptc.cristancho.library.cui;

/**
 * Clase FormInputData, encargada de leer los datos de un formulario dados por el usuario
 * Fecha: 02/03/2018
 * 
 * @author Fabian Alejandro Cristancho Rincon
 *
 */

public class FormInputData {

	/**
	 * Metodo que muestra la etiqueta de los datos proporcionados por teclado
	 * 
	 * @param question
	 *            Mensaje que explica lo que el usuario debe entrar por teclado
	 * @return entrada de numero double
	 * @throws NumberFormatException
	 *             Excepcion en caso de que no se proporcione un numero
	 */

	public double showLabel(String question) throws NumberFormatException {
		System.out.print(question);
		MyInput myInput = new MyInput();
		return myInput.readDouble();
	}

}
