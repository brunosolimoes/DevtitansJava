import java.util.Scanner;

public class PontoReta {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		float x = teclado.nextFloat();
		float y = teclado.nextFloat();
		if( ((2*x)+y) == 3) {
			System.out.printf("Ponto (%.1f, %.1f) pertence a reta 2x + y = 3.", x,y);
		}else {
			System.out.printf("Ponto (%.1f, %.1f) nao pertence a reta 2x + y = 3.", x,y);
		}
	}

}
