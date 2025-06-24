
public class Computador {
	String fabricante;
	Processador processador;
	Memoria memoria;
	Disco disco;
	
	Computador(String fabricante, Processador processador, Memoria memoria, Disco disco){
		this.fabricante = fabricante;
		this.processador = processador;
		this.memoria = memoria;
		this.disco = disco;
	}
	
	String getDescricao() {
		String desc = "";
		
		desc = "Computador da fabricante "+this.fabricante+". "+
				this.processador.getDescricao()+this.memoria.getDescricao()+
				this.disco.getDescricao();
		
		return desc;
	}
}
