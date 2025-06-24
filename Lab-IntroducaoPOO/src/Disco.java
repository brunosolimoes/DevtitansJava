
public class Disco {
	String marca;
	String tipo;
	double capacidade;
	int rpm;
	
	Disco(){
		this.marca = null;
		this.tipo = null;
		this.capacidade = 0;
		this.rpm = 0;
	}
	
	Disco(String marca, String tipo, double capacidade, int rpm){
		this.marca = marca;
		this.tipo = tipo;
		this.capacidade = capacidade;
		this.rpm = rpm;
	}
	
	String getDescricao() {
		String desc = "";
		
		desc = "Disco: marca="+this.marca+", tipo="+this.tipo+", capacidade="+String.valueOf(this.capacidade)+"GB , rpm="+String.valueOf(this.rpm)+"rpm.";
		
		return desc;
	}
}
