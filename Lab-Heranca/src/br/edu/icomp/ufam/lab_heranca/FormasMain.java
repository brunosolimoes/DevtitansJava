package br.edu.icomp.ufam.lab_heranca;
import java.util.*;

public class FormasMain {

	public static void main(String[] args) {
		ArrayList<FormaGeometrica> objetos = new ArrayList<FormaGeometrica>();
		
		Circulo circ1 = new Circulo(1,1,2);
		
		Retangulo ret1 = new Retangulo(5,5,4,8);
		
		Quadrado quad1 = new Quadrado(8,8,5);
		
		objetos.add(circ1);
		objetos.add(ret1);
		objetos.add(quad1);
		
		for(FormaGeometrica obj : objetos) {
			System.out.println(obj);
		}
		
	}

}
