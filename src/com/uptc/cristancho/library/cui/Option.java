package com.uptc.cristancho.library.cui;

/**
 * Clase Option, encargada de generar y mostrar las principales opciones de un
 * menu Fecha: 01/03/2018
 * 
 * @author Fabian Alejandro Cristancho Rincon
 *
 */

public class Option {

	private char id;
	private String title;
	private String action;

	/**
	 * Constructor de la clase Option
	 * 
	 * @param id
	 *            Id de la opcion
	 * @param title
	 *            Titulo de la opcion
	 * @param action
	 *            Accion que va a realizar dicha opcion
	 */

	public Option(char id, String title, String action) {
		this.id = id;
		this.title = title;
		this.action = action;
	}

	/**
	 * Obtiene el valor del id de la opcion
	 * 
	 * @return Id de la opcion
	 */

	public char getId() {
		return id;
	}

	/**
	 * Asigna un valor de id a la opcion
	 * 
	 * @param id
	 *            Id de la opcion
	 */

	public void setId(char id) {
		this.id = id;
	}

	/**
	 * Obtiene el titulo propio de la opcion
	 * 
	 * @return Titulo de la opcion
	 */

	public String getTitle() {
		return title;
	}

	/**
	 * Asigna un titulo a la opcion establecida
	 * 
	 * @param title
	 *            Titulo de la opcion
	 */

	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Obtiene la accion que realiza la opcion
	 * 
	 * @return Accion a realizar por la opcion
	 */

	public String getAction() {
		return action;
	}

	/**
	 * Asigna una accion a la opcion establecida
	 * 
	 * @param action
	 *            Accion establecida en la opcion
	 */

	public void setAction(String action) {
		this.action = action;
	}

	/**
	 * Metodo que imprime una opcion completa
	 */

	public void show() {
		System.out.println(this.id + "" + this.title);
	}

}
