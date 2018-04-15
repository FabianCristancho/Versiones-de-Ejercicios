package com.uptc.cristancho.library.test;

import com.uptc.cristancho.library.cui.FormInputData;

/**
 * Test unitario de la clase FormInputData
 * Fecha: 02/03/2018
 * @author Fabian Alejandro Cristancho Rincon
 *
 */

public class TestFormInputData {
	
	/**
	 * Metodo princial encargado de inspeccionar posibles errores contenidos en la clase FormInputData
	 * @param args
	 */

	public static void main(String[] args) {
		FormInputData formInputData = new FormInputData();
		boolean ok;
		do {
			ok = true;
			try {
				System.out.print("El valor digitado es " 
									+formInputData.showLabel("Digite el valor de la longitud de lado A y de enter: "));
			} catch (NumberFormatException e) {
				System.out.println("El valor digitado no corresponde a un numero. \nDigite solo digitos numericos. \nIntentelo de nuevo");
				ok = false;
			}
		}while(!ok);
		

	}

}
