package com.uptc.cristancho.library.test;


import com.uptc.cristancho.library.cui.Command;
import com.uptc.cristancho.library.cui.Menu;
import com.uptc.cristancho.library.cui.Option;

/**
 * Test unitario de la clase Menu Fecha: 01/03/2018
 * 
 * @author Fabian Alejandro Cristancho Rincon
 *
 */

public class TestMenu {
	/**
	 * Metodo encargado de probar la clase Menu con el fin de encontrar posibles
	 * errores
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Option[] options = { new Option('I', ". Ingresar datos de la circunferencia", Command.COMMAND_INPUT_DATA),
				new Option('C', ". Determinar si las circunferencias se intersectan", Command.COMMAND_ACTION),
				new Option('A', ". Ayuda", Command.COMMAND_HELP),
				new Option('D', ". Acerca de..", Command.COMMAND_ABOUT),
				new Option('T', ". Terminar", Command.COMMAND_EXIT), };

		Menu menu = new Menu(options);
		String commString = "";

		do {
			commString = menu.show();
			System.out.println("El comando elegido es " + commString);
		} while (!commString.equals(Command.COMMAND_EXIT));
		System.out.println("gAME OVER");
	}
}
