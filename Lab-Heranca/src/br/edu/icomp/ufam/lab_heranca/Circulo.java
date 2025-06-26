package br.edu.icomp.ufam.lab_heranca;
import java.math.*;

public class Circulo extends FormaGeometrica{
	public double raio;

	public Circulo(int posX, int posY, double raio){
		this.posX = posX;
		this.posY = posY;
		this.raio = raio;
	}
	
	public double getArea() {
		return this.raio*this.raio*Math.PI;
	}
	
	public double getPerimetro() {
		return this.raio*2*Math.PI;
	}
	
	public String toString() {
		return "Círculo na " + this.getPosString() + " com raio de " + String.valueOf(this.raio) + "cm (área=" + String.valueOf(this.getArea()) + "cm2, perímetro=" + String.valueOf(this.getPerimetro())+ "cm)";
	}
}
