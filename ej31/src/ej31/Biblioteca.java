package ej31;

import java.util.ArrayList;

public class Biblioteca {
	private ArrayList<Libro> libros;
	private ArrayList<Lector> lectores;

	private static Biblioteca _biblioteca;

	private Biblioteca() {
	}

	public static Biblioteca getInstance() {
		if (_biblioteca == null) {
			_biblioteca = new Biblioteca();
			return _biblioteca;
		} else {
			return _biblioteca;
		}
	}

}
