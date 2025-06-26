package br.edu.icomp.ufam.lab_heranca;

public class Quadrado extends Retangulo{

	public Quadrado(int posX, int posY, double lado) {
		super(posX, posY, lado, lado);
		
	}

	public String toString() {
		return "Quadrado na " + this.getPosString() + " com lado de " + String.valueOf(this.altura) + "cm (área=" + String.valueOf(this.getArea()) + "cm2, perímetro=" + String.valueOf(this.getPerimetro()) + "cm)";
	}
	
}
