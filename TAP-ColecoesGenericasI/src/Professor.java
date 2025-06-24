
public class Professor {
	String titulacao;
	String nome;
	int matricula;
	
	Professor(){
		this.titulacao = null;
		this.nome = null;
		this.matricula = 0;
	}
	
	Professor(String titulacao,	String nome, int matricula){
		this.titulacao = titulacao;
		this.nome = nome;
		this.matricula = matricula;
	}
	
	String getDescricao() {
		String desc = "";
		
		desc = "Prof. "+this.titulacao+this.nome+" - mat "+String.valueOf(this.matricula);
		
		return desc;
	}
}
