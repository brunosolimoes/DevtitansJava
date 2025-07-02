package br.edu.ufam.icomp.lab_excecoes;

public class CoordenadaNegativaException extends RoverCoordenadaException{
	private static final long serialVerionUID = 4L;
	
	public CoordenadaNegativaException() {
		this("Coordenada com valor negativo");
	}
	
	public CoordenadaNegativaException(String s) {
		super(s);
	}
	
}
