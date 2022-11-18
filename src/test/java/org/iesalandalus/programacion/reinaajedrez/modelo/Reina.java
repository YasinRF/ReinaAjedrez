package org.iesalandalus.programacion.reinaajedrez.modelo;


public class Reina {
	
	private Color color;
	private Posicion posicion;
	public Color getColor() {
		return color;
	}
	private void setColor(Color color) {
		if(color==null) {
			throw new NullPointerException("ERROR: El color no puede ser nulo.");
		}
		this.color = color;
	}
	public Posicion getPosicion() {
		return posicion;
	}
	private void setPosicion(Posicion posicion) {
		if(posicion==null) {
			throw new NullPointerException("La posición no es la esperada");
		}
		this.posicion = posicion;
	}
	
	public Reina() {
		color=color.BLANCO;
		posicion= new Posicion(1, 'd');
	}
	
	public Reina(Color color) {
		if(color==null) {
			throw new NullPointerException("Error color");
		}
		if (color==color.BLANCO) {
			posicion= new Posicion(1, 'd');
		}
		else if(color==color.NEGRO) {
			posicion= new Posicion(8, 'd');
		}
	}
	
	
	
	
	
	
}
