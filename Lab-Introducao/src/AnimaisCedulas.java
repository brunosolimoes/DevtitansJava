import java.util.Scanner;

public class AnimaisCedulas {

        public static void main(String[] args) {
                Scanner teclado = new Scanner(System.in);

                int cedula = teclado.nextInt();

                if(cedula == 2) {
                        System.out.println("Tartaruga");
                } else {
                    if(cedula == 5) {
                    	System.out.println("GarÇa");
                    } else {
                        if(cedula == 10) {
                        	System.out.println("Arara");
                        } else {
                            if(cedula == 20) {
                            	  System.out.println("Mico-leão-dourado");
                            } else {
                                if(cedula == 50) {
                                	 System.out.println("OnÇa-pintada");
                              } else {
                                  if(cedula == 100) {
                                	  System.out.println("Garoupa");
                                  }else{
				   	  System.out.println("erro");
				        }
                                     }
                        	   }
                    		}
                	}
                }           
        }

}
