package br.edu.icomp.ufam.lab_heranca;

public class Retangulo extends FormaGeometrica{
	public double largura;
	public double altura;
	
	public Retangulo(int posX, int posY, double largura, double altura){
		this.posX = posX;
		this.posY = posY;
		this.largura = largura;
		this.altura = altura;
	}
	
	public double getArea() {
		return this.altura*this.largura;
	}

	
	public double getPerimetro() {
		return 2*(this.largura+this.altura);
	}
	
	public String toString() {
		return "Retângulo na " + this.getPosString() + " com largura de " + String.valueOf(this.largura) + "cm e altura de " + String.valueOf(this.altura) + "cm (área=" + String.valueOf(this.getArea()) + "cm2, perímetro=" + String.valueOf(this.getPerimetro()) + "cm)";
	}

}
