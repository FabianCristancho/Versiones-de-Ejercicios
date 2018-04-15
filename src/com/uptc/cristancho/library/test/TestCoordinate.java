package com.uptc.cristancho.library.test;

import com.uptc.cristancho.library.logic.Coordinate;

/**
 * Test unitario de la clase Coordinate Fecha: 21/02/2018
 * 
 * @author Fabian Alejandro Cristancho Rincón
 *
 */

public class TestCoordinate {

	/**
	 * Encargado de verificar los metodos de la clase Coordinate y encontrar
	 * posibles errores
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		Coordinate coordinate = new Coordinate(100, 100);
		System.out.println("caso 1: " + (coordinate.distanceTo(new Coordinate(200, 100)) == 100 ? "OK" : "ERROR"));
		System.out.println("caso 2: " + (coordinate.distanceTo(new Coordinate(100, 200)) == 100 ? "OK" : "ERROR"));
		System.out.println("caso 3: " + (coordinate.distanceTo(new Coordinate(100, 100)) == 0 ? "OK" : "ERROR"));

	}

}
