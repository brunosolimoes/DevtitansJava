
public class Memoria {
	String marca;
	String tipo;
	double tamanho;
	double velocidade;
	int numPentes;
	
	Memoria(){
		this.marca = null;
		this.tipo = null;
		this.tamanho = 0;
		this.velocidade = 0;
		this.numPentes = 0;
	}
	
	Memoria(String marca, String tipo, double tamanho, double velocidade, int numPentes){
		this.marca = marca;
		this.tipo = tipo;
		this.tamanho = tamanho;
		this.velocidade = velocidade;
		this.numPentes = numPentes;
	}
	
	double getTamanhoTotal() {
		double tamanhoTotal = this.tamanho*this.numPentes; 
		return tamanhoTotal;
	}
	
	double getVelocidadeParalela() {
		double velocidadeParalela = this.numPentes*this.velocidade;
		return velocidadeParalela;
	}
	
	String getDescricao() {
		String desc = "";
		
		desc = "Memoria: marca="+this.marca+", tipo="+this.tipo+", tamanho="+this.tamanho+"GB, velocidade="+this.velocidade+"GHz, numPentes="+String.valueOf(this.numPentes)+", tamanhoTotal="+String.valueOf(this.getTamanhoTotal())+ "GB, velocidadeParalela="+String.valueOf(this.getVelocidadeParalela())+"GHz.";
		
		return desc;
	}
}
