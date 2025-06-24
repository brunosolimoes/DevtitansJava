
public class Processador {
	
	String marca;
	String modelo;
	double velocidade;
	int numNucleos;
	
	Processador(){
		this.marca = null;
		this.modelo = null;
		this.velocidade = 0;
		this.numNucleos = 0;
	}
	
	Processador(String marca, String modelo, double velocidade, int numNucleos){
		this.marca = marca;
		this.modelo = modelo;
		this.velocidade = velocidade;
		this.numNucleos = numNucleos;
	}
	
	double getVelocidadeParalela() {
		return (this.velocidade*this.numNucleos);
	}
	
	String getDescricao() {
		String desc = "";
		
		desc = "Processador: marca="+this.marca +", modelo="+this.modelo+", velocidade="+String.valueOf(this.velocidade)+"GHz, numNucleos="+String.valueOf(this.numNucleos)+", velocidadeParalela="+String.valueOf(this.getVelocidadeParalela())+"GHz.";
		
		return desc;
	}
}
