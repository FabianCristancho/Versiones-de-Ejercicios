package com.uptc.cristancho.library.test;

import com.uptc.cristancho.library.utilities.MyString;

/**
 * Clase TestMyString Fecha: 23/02/2018
 * 
 * @author Fabian Alejandro Cristancho Rincon
 *
 */

public class TestMyString {

	/**
	 * Metodo que ejecuta el programa y verifica el funcionamiento de la clase
	 * MyString
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		MyString myString = new MyString("");
		System.out.println("" + myString.generateChar(10, 'x'));
		System.out.println("" + myString.generateChar(30, '*'));
		System.out.println("");

		System.out.println("0123456789012345678901234567890123456789");
		System.out.println(new MyString(
				"|" + "Programa que calcula el area de un triangulo a partir de valores de sus lados o coordenadas")
						.wordWrap(34)
				+ "|");

	}

}
