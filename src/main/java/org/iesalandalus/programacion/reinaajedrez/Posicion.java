package org.iesalandalus.programacion.reinaajedrez;

import java.util.Objects;

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
	private void setFila(int fila) {
		
		if (fila<1 || fila>8) {
			 throw new NullPointerException("La fila no puede ser menos de 1 y mas de 8");
		}
		this.fila = fila;
	}
	
	private void setColumna(char columna) {
		if (columna<'a' || columna>'h') {
			 throw new NullPointerException("La fila tiene que estar entre a y h ambos incluidos");	
		}
		this.columna = columna;
	}
		
	public int getFila() {
		return fila;
	}
	

	public char getColumna() {
		return columna;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(columna, fila);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Posicion other = (Posicion) obj;
		return columna == other.columna && fila == other.fila;
	}
	
	@Override
	public String toString() {
		return "fila=" + fila + ", columna=" + columna;
	}
	
}