import java.util.*;

public class Turma {
	String disciplina;
	int ano;
	int semestre;
	Professor professor;
	ArrayList<Aluno> alunos;
	
	Turma(String disciplina, int ano, int semestre, Professor professor){
		this.disciplina = disciplina;
		this.ano = ano;
		this.semestre = semestre;
		this.professor = professor;
		this.alunos = new ArrayList<Aluno>();
	}
	
	void addAluno(Aluno aluno) {
		
		if(this.getAluno(aluno.matricula) == null) {
			this.alunos.add(aluno);
		}
		
	}
	
	Aluno getAluno(int matricula) {
		
		for(Aluno al : this.alunos) {
			if(al.matricula == matricula) {
				return al;
			}
		}
		return null;
	}
	
	double getMediaIdade() {
		double med = 0;
		
		for(Aluno al : this.alunos) {
			med = med + al.getIdade();
		}
		med = med/this.alunos.size();
		
		return med;
	}
	
	String getDescricao() {
		String desc = "";
		
		desc = "Turma " + this.disciplina + " - " + String.valueOf(this.ano) + "/" + String.valueOf(this.semestre) + " (" + this.professor.getDescricao() + "):";
		
		for(Aluno al : this.alunos) {
			desc = desc + "\n  - Aluno " + String.valueOf(this.alunos.indexOf(al)+1) + ": " + al.getDescricao();
		}
		
		return desc;
	}
}
