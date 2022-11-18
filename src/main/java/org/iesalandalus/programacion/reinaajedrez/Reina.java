package org.iesalandalus.programacion.reinaajedrez;

public class Reina {
	
	private Color color;
	private Posicion posicion;
	
	public Reina() {
	posicion = new Posicion(1,'d');
	color = Color.BLANCO;
	}
	
	public Reina(Color color) {
		if (color==Color.BLANCO) {
			posicion = new Posicion(1,'d');
		}
		if (color==Color.NEGRO) {
			posicion = new Posicion(8,'d');
		}
	}
	
}
