package br.edu.ufam.icomp.lab_excecoes;

public class Caminho {
	private Coordenada caminho[];
	private int tamanho;
	
	public Caminho(int maxTam) {
		this.caminho = new Coordenada[maxTam];
		this.tamanho = 0;
	}
	
	public int tamanho() {
		return this.tamanho;
	}
	
	public void addCoordenada(Coordenada coordenada) throws TamanhoMaximoExcedidoException, DistanciaEntrePontosExcedidaException {
		if(this.tamanho<this.caminho.length) {
			if(this.tamanho==0) {
				this.caminho[0] = coordenada;
				this.tamanho = this.tamanho+1;
			}else {
				if((this.caminho[this.tamanho()-1].distancia(coordenada))>15) {
					throw new DistanciaEntrePontosExcedidaException();
				}else {
					this.caminho[this.tamanho()] = coordenada;
					this.tamanho = this.tamanho+1;
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
