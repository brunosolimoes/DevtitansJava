package br.edu.ufam.icomp.lab_encapsulamento;
import java.util.*;

public class GISMain {

	public static void main(String[] args) {
		
		Localizavel vetorLocalizaveis[] = new Localizavel[4];
		
		Posicao pos1 = new Posicao(-3.089242, -59.964874, 88.374);
		
		System.out.printf(pos1.toString());
		System.out.println();
		
		
		Celular cel1 = new Celular(1,10,10000000);
		Celular cel2 = new Celular(2,20,20000000);
		
		System.out.printf(cel1.getPosicao().toString());
		
		CarroLuxuoso carL1 = new CarroLuxuoso("dev1");
		CarroLuxuoso carL2 = new CarroLuxuoso("dev2");
		
		System.out.println("");
		
		vetorLocalizaveis[0] = cel1;
		vetorLocalizaveis[1] = cel2;
		vetorLocalizaveis[2] = carL1;
		vetorLocalizaveis[3] = carL2;
		
		
		for(int i =0;i<vetorLocalizaveis.length;i++) {
			System.out.println("");
			System.out.printf(vetorLocalizaveis[0].getPosicao().toString());
		}
		

	}

}
