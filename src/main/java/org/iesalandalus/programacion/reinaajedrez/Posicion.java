package org.iesalandalus.programacion.reinaajedrez;

public class Posicion {
	
	private int fila;
	private char columna;
	
	public Posicion(int fila, char columna) {
		setFila(fila);
		setColumna(columna);
	}
	
	public Posicion(Posicion posicion) {
		if (posicion==null) {
			throw new NullPointerException("la posicion no puede ser nula");
		}
	}

	public int getFila() {
		return fila;
	}
	
	public void setFila(int fila) {
		this.fila = fila;
	}

	public char getColumna() {
		return columna;
	}

	public void setColumna(char columna) {
		this.columna = columna;
	}
}