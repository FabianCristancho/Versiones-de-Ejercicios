package com.uptc.cristancho.library.test;

import com.uptc.cristancho.library.cui.Command;
import com.uptc.cristancho.library.cui.Option;

/**
 * Test unitario de la clase Option Fecha: 01/03/2018
 * 
 * @author Fabian Alejandro Cristancho Rincon
 *
 */

public class TestOption {

	/**
	 * Metodo encargado de realizarle un analisis a la clase Option con el fin de
	 * encontrar posibles errores
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		Option option = new Option('I', ". Ingresar datos del triangulo", Command.COMMAND_INPUT_DATA);
		option.show();

	}

}
