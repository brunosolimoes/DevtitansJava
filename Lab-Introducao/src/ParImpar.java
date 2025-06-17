import java.util.Scanner;

public class ParImpar {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int vet[] = new int[50];
		int cont=0;
		
		vet[cont] = teclado.nextInt();
		while(vet[cont]!=-1) {
			cont++;
			vet[cont] = teclado.nextInt();
		}
		cont = 0;
		while(vet[cont]!=-1){
			if(vet[cont]%2==1) {
				System.out.println("IMPAR");
				cont++;
			}else {
				System.out.println("PAR");
				cont++;
			}
		}
				
		
		teclado.close();
	}

}
