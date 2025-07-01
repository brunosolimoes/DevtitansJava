package br.edu.ufam.icomp.lab_encapsulamento;
import java.util.*;

public class GISMain {

	public static void main(String[] args) {
		
		ArrayList<Localizavel> vetorLocalizaveis = new ArrayList<Localizavel>();
		
		Posicao pos1 = new Posicao(-3.089242, -59.964874, 88.374);
		
		System.out.printf(pos1.toString());
		System.out.println();
		
		
		Celular cel1 = new Celular(1,10,10000000);
		Celular cel2 = new Celular(2,20,20000000);
		
		System.out.printf(cel1.getPosicao().toString());
		
		CarroLuxuoso carL1 = new CarroLuxuoso("dev1");
		CarroLuxuoso carL2 = new CarroLuxuoso("dev2");
		
		
		
		vetorLocalizaveis.add(cel1);
		vetorLocalizaveis.add(cel2);
		vetorLocalizaveis.add(carL1);
		vetorLocalizaveis.add(carL2);
		
		for(Localizavel obj : vetorLocalizaveis) {
			System.out.printf(obj.getPosicao().toString());
			System.out.println("");
		}
	}

}
