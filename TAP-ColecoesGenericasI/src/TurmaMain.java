
public class TurmaMain {

	public static void main(String[] args) {
		Aluno aluno = new Aluno("Emmet L. Brown", 7714, 2002);

		System.out.printf(aluno.getDescricao());
		System.out.println("");
		
		Professor prof = new Professor("Hubert J. Farnsworth", "Dr.", 2208);
		System.out.printf(prof.getDescricao());
		System.out.println("");
	}

}
