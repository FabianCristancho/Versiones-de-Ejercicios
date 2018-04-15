package com.uptc.cristancho.library.cui;

import com.uptc.cristancho.library.cui.MyInput;

/**
 * Clase Menu, se encarga de mostrar las opciones que componen el programa
 * Fecha: 01/03/2018
 * 
 * @author Fabian Alejandro Cristancho Rincon
 *
 */

public class Menu {

	private Option[] options;

	/**
	 * Constructor que almacena un array de opciones
	 * 
	 * @param options
	 *            Array que va a ser proporcionado
	 */

	public Menu(Option[] options) {
		this.options = options;
	}

	/**
	 * Separa cada uno de los ids de opcion con una coma
	 * 
	 * @return Cadena separada por comas
	 */
	private String idsOption() {
		String string = "";
		for (Option option : options) {
			string += option.getId() + ",";
		}

		return string.substring(0, string.length() - 1);
	}

	/**
	 * Obtiene el comando de la opción requerida
	 * 
	 * @param option
	 *            Caracter de opción que se proporciona
	 * @return Accion que va a realizar dicho comando. En caso de no ser valido,
	 *         retorna null
	 */

	private String getCommand(char option) {

		for (Option option1 : options) {
			if (option1.getId() == option) {
				return option1.getAction();
			}
		}
		return null;
	}

	/**
	 * Muestra la cadena del comando que se va a ejecutar
	 * 
	 * @return Comando a ejecutar
	 */

	public String show() {
		String command;

		do {
			for (Option option1 : options) {
				option1.show();
			}
			System.out.print("Digite el caracter de la opcion deseada [" + idsOption() + "] y de enter: ");
			command = getCommand(new MyInput().getOption());
			if (command == null) {
				System.out.println("Error: el caracter digitado no corresponde a las opciones");
				System.out.println(" intente de nuevo\n\n");
			}
		} while (command == null);
		return command;

	}

}
