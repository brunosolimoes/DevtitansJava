package br.edu.ufam.icomp.lab_excecoes;

public class DistanciaEntrePontosExcedidaException extends RoverCaminhoException{
	private static final long serialVerionUID = 8L;
	
	public DistanciaEntrePontosExcedidaException() {
		this("Distância máxima entre duas coordenadas vizinhas excedida");
	}
	
	public DistanciaEntrePontosExcedidaException(String s) {
		super(s);
	}
}
