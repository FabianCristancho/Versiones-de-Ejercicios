package com.uptc.cristancho.library.utilities;

/**
 * Clase MyString que modifica el contenido de la presentacion (splash) Fecha:
 * 23/02/2018
 * 
 * @author Fabian Alejandro Cristancho Rincon
 *
 */

public class MyString {
	private String text;

	/**
	 * Constructor de la clase MyString que recibe un String como parametro
	 * 
	 * @param text
	 *            Texto proporcionado por el usuario
	 */

	public MyString(String string) {
		this.text = string;
	}

	/**
	 * Obtiene el valor del texto
	 * 
	 * @return Texto establecido
	 */

	public String getText() {
		return text;
	}

	/**
	 * Asigna un valor de texto de tipo String
	 * 
	 * @param text
	 *            Texto proporcionado por el usuario
	 */

	public void setText(String text) {
		this.text = text;
	}

	/**
	 * Genera una secuencia de caracteres "character" de longitud "count"
	 * 
	 * @param count
	 *            cantidad de caracterees a genera
	 * @param character
	 *            el caracter que se genera
	 * @return string con los count caracters
	 */

	public String generateChar(int count, char character) {
		String string = "";
		for (int i = 0; i < count; i++) {
			string += character;
		}
		return string;
	}

	/**
	 * Centra el texto en un ancho de caracteres dados por el parámetro width
	 * 
	 * @param text
	 *            Texto que brinda una pequeña descripcion acerca del programa
	 * @param width
	 *            Ancho de caja del borde en el splash
	 * 
	 * @return El texto centrado (caracteres en blanco antes y despues del texto)
	 */

	public String centerText(String text, int width) {
		return (generateChar((width - text.length()) / 2, ' ') + text
				+ generateChar(width - ((width - text.length()) / 2 + text.length()), ' ')).substring(0, width);
	}

	/**
	 * Organiza el texto de manera que este no se salga de la caja que contiene el
	 * splash
	 * 
	 * @param width
	 *            Ancho de borde
	 * @return El texto organizado (en caso de ser demasiado grande se corta y el
	 *         restante se escribe en la siguente linea)
	 */

	public String wordWrap(int width) {
		String[] strings = this.text.split(" ");
		String line;
		text = "";
		int j = 0;

		while (j < strings.length) {
			line = "";
			for (int i = j; i < strings.length && line.length() + strings[i].length() < width; i++) {
				line += strings[i] + " ";
				j = i + 1;
			}
			text += centerText(line, width);
			if (j != strings.length)
				text += "\n";
		}
		return text;
	}

}
