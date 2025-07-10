package br.edu.ufam.icomp.lab_excecoes;
import java.math.*;
public class Coordenada {
	private int posX;
	private int posY;
	private int digito;
	
	public Coordenada(int posX, int posY, int digito) throws CoordenadaNegativaException, CoordenadaForaDosLimitesException, DigitoInvalidoException {
		if(posX<0 || posY<0) {
			throw new CoordenadaNegativaException();
		}
		else {
			if(posX>30000 || posY>30000) {
				throw new CoordenadaForaDosLimitesException();	
			}else {
				if(digito<0 || digito>9) {
					throw new DigitoInvalidoException();
				}else {
					if(((posX+posY)%10) != digito) {
						throw new DigitoInvalidoException();
					}else {
						this.posX = posX;
						this.posY = posY;
						this.digito = digito;
					}
				}
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
