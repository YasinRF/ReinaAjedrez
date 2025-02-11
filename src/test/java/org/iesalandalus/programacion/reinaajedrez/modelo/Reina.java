package org.iesalandalus.programacion.reinaajedrez.modelo;

import javax.naming.OperationNotSupportedException;

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
	
	public void mover(Direccion direccion, int pasos) throws OperationNotSupportedException {
		
		if (direccion == null) {
			throw new NullPointerException("ERROR: La dirección no puede ser nula.");
		}
		if (pasos < 1 || pasos > 7) {
			throw new IllegalArgumentException("ERROR: El número de pasos debe estar comprendido entre 1 y 7.");
		}

	switch (direccion) {
	case NORTE:
		if (posicion.getFila() + pasos > 8) {
			posicion = getPosicion();
			throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
		} else
			setPosicion(new Posicion(posicion.getFila() + pasos, posicion.getColumna()));
		break;

	case SUR:
		if (posicion.getFila() - pasos <= 0) {
			posicion = getPosicion();
			throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
		} else
			setPosicion(new Posicion(posicion.getFila() - pasos, posicion.getColumna()));
		break;

	case ESTE:
		if (posicion.getColumna() + (char) pasos > 'h') {
			posicion = getPosicion();
			throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
		} else
			setPosicion(new Posicion(posicion.getFila(), (char) (posicion.getColumna() + pasos)));
		break;

	case OESTE:
		if (posicion.getColumna() - (char) pasos < 'a') {
			posicion = getPosicion();
			throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
		} else
			setPosicion(new Posicion(posicion.getFila(), (char) (posicion.getColumna() - pasos)));
		break;

	case NORESTE:
		if (posicion.getFila() + pasos > 8 || posicion.getColumna() + (char) pasos > 'h') {
			posicion = getPosicion();
			throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
		} else
			setPosicion(new Posicion(posicion.getFila() + pasos, (char) (posicion.getColumna() + pasos)));
		break;

	case SUROESTE:
		if (posicion.getFila() - pasos <= 0 || posicion.getColumna() - (char) pasos < 'a') {
			posicion = getPosicion();
			throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
		} else
			setPosicion(new Posicion(posicion.getFila() - pasos, (char) (posicion.getColumna() - pasos)));
		break;

	case SURESTE:
		if (posicion.getFila() - pasos <= 0 || posicion.getColumna() + (char) pasos > 'h') {
			posicion = getPosicion();
			throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
		} else
			setPosicion(new Posicion(posicion.getFila() - pasos, (char) (posicion.getColumna() + pasos)));
		break;

	case NOROESTE:
		if (posicion.getFila() + pasos > 8 || posicion.getColumna() - (char) pasos < 'a') {
			posicion = getPosicion();
			throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
		} else
			setPosicion(new Posicion(posicion.getFila() + pasos, (char) (posicion.getColumna() - pasos)));
		break;
	default:
		break;
	}
}
	
	@Override
	public String toString() {
		return String.format("Reina color=%s, posicion=%s", color, posicion);
	}
	
	
	
	
	
}
