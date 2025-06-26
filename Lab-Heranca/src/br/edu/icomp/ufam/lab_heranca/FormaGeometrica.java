package br.edu.icomp.ufam.lab_heranca;

public abstract class FormaGeometrica {
	public int posX;
	public int posY;
	
	public FormaGeometrica(){
		this.posX = 0;
		this.posY = 0;
	}
	
	public FormaGeometrica(int posX, int posY){
		this.posX = posX;
		this.posY = posY;
	}
	
	public abstract double getArea();
	
	public abstract double getPerimetro();

	public String getPosString() {
		return "posição (" + String.valueOf(this.posX) + ", " + String.valueOf(this.posY) + ")";
	}
}
