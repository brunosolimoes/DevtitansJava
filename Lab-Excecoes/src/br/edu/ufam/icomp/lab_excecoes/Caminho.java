package br.edu.ufam.icomp.lab_excecoes;

public class Caminho {
	private Coordenada caminho[];
	private int tamanho;
	
	public Caminho(int maxTam) {
		this.caminho = null;
		this.tamanho = maxTam;
	}
	
	public int tamanho() {
		if(this.caminho == null) return 0; 
		return this.caminho.length;
	}
	
	public void addCoordenada(Coordenada coordenada) throws TamanhoMaximoExcedidoException, DistanciaEntrePontosExcedidaException {
		if(this.caminho.length<this.tamanho) {
			if(this.caminho == null) {
				this.caminho[0] = coordenada;
			}else {
				if((this.caminho[this.caminho.length-1].distancia(coordenada))>15) {
					throw new DistanciaEntrePontosExcedidaException();
				}else {
					this.caminho[this.caminho.length] = coordenada;
				}
			}
			
		}else {
			throw new TamanhoMaximoExcedidoException();
		}
	}
	
	public void reset() {
		this.caminho = null;
		this.tamanho = 0;
	}
	
	public String toString() {
		String desc = "Dados do caminho: \n  - Quantidade de pontos: "+String.valueOf(this.tamanho()) + "\n  - Pontos:";
		
		for(int i=0;i<this.tamanho();i++) {
			desc = desc + "\n    -> "+ this.caminho[i].toString();
		}
		
		return desc;
	}
}
