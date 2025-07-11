package br.edu.ufam.icomp.lab_excecoes;

public class Caminho {
	private Coordenada caminho[];
	private int maxTam;
	private int tamanho;
	
	public Caminho(int maxTam) {
		this.caminho = null;
		this.tamanho = 0;
		this.maxTam = maxTam;
	}
	
	public int tamanho() {
		if(this.caminho == null) return 0; 
		return this.caminho.length;
	}
	
	public void addCoordenada(Coordenada coordenada) throws TamanhoMaximoExcedidoException, DistanciaEntrePontosExcedidaException {
		if(this.tamanho()<this.maxTam) {
			if(this.caminho == null) {
				this.caminho[0] = coordenada;
			}else {
				if((this.caminho[this.tamanho()-1].distancia(coordenada))>15) {
					throw new DistanciaEntrePontosExcedidaException();
				}else {
					this.caminho[this.tamanho()] = coordenada;
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
