package br.edu.ufam.icomp.lab_excecoes;
import java.math.*;
public class Coordenada {
	private int posX;
	private int posY;
	private int digito;
	
	public Coordenada(int posX, int posY, int digito) {
		if(posX<0 || posY<0) {
			CoordenadaNegativaException e = null;
			System.out.print(e);
		}else {
			if(posX>30000 || posY>30000) {
				
			}
		}
	}
	
	public int getPosX() {
		return this.posX;
	}
	
	public int getPosY() {
		return this.posY;
	}
	
	public double distancia(Coordenada coordenada) {
		double distX = this.posX - coordenada.posX;;
		double distY= this.posY - coordenada.posY;
		double dist=0;
		
		dist = Math.sqrt((Math.pow(distX, 2))+(Math.pow(distY, 2)));
		
		return dist;
	}
	
	public String toString() {
		return String.valueOf(this.getPosX()) + ", " + String.valueOf(this.getPosY());
	}
}
