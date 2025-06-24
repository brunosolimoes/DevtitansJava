
public class ComputadorMain {

	public static void main(String[] args) {
		Processador proce = new Processador("Intel","i7",3.2, 8);
		
		System.out.printf(proce.getDescricao());
		System.out.println("");
		
		Memoria memo = new Memoria("Kingston", "DDR4", 8,3.2,4);
		
		System.out.printf(memo.getDescricao());
		System.out.println("");
		
		Disco disc = new Disco("Western Digital", "HDD", 400, 9600);
		
		System.out.printf(disc.getDescricao());
		System.out.println("");
		
		Computador comp = new Computador("Dell", proce, memo, disc);
		System.out.printf(comp.getDescricao());
		System.out.println("");
	}

}
