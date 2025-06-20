import java.util.Scanner;
import java.math.*;

public class AngryBirds {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		double v0 = teclado.nextDouble();
		double angulo = teclado.nextDouble();
		double d = teclado.nextDouble();
		angulo = Math.toRadians(angulo);
		double dist = ( (v0*v0) * Math.sin(2*angulo) ) / 9.8;
		
		if(dist <= d + 0.1 && dist >= d - 0.1) {
			System.out.print("1");
		}else {
			System.out.print("0");
		}
	}
	
}
