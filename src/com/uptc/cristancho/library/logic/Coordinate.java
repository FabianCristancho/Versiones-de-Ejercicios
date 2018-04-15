package com.uptc.cristancho.library.logic;

/**
 * Clase Coordenada encargada de asignar dos puntos especificos Fecha:
 * 21/02/2018
 * 
 * @author Fabian Alejandro Cristancho Rincón
 *
 */

public class Coordinate {

	private double x;
	private double y;

	/**
	 * Constructor de la clase Coordenada
	 * 
	 * @param x
	 *            Valor de la coordenada x
	 * @param y
	 *            Valor de la coordenada y
	 */

	public Coordinate(double x, double y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Obtiene el valor de x de la coordenada
	 * 
	 * @return Valor de x, eje horizontal de un plano
	 */

	public double getX() {
		return x;
	}

	/**
	 * Asigna el valor de x de la coordenada
	 * 
	 * @return Valor de x en el eje horizontal
	 */

	public void setX(double x) {
		this.x = x;
	}

	/**
	 * Obtiene el valor de y de la cordenada
	 * 
	 * @return Valor de y en el eje vertical de un plano
	 */

	public double getY() {
		return y;
	}

	/**
	 * Asigna un valor a la coordenada y
	 * 
	 * @param Valor
	 *            de la coordenada y en el eje vertical
	 */

	public void setY(double y) {
		this.y = y;
	}

	/**
	 * Calcula la distancia de una coordenada a otra
	 * 
	 * @param coordinate
	 *            Coordenada a la cual va a calcular la distancia
	 * @return Valor de la distancia
	 */

	public double distanceTo(Coordinate coordinate) {
		return Math.hypot((this.x - coordinate.x), (this.y - coordinate.y));
	}

}

