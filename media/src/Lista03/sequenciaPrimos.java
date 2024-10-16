package Lista03;

import java.util.Scanner;

public class sequenciaPrimos {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Vamos verificar numeros primos!");
		
		System.out.println("Insira um numero positivo:");
		int numero = scanner.nextInt();
		
		scanner.close();
		
		boolean ehPrimo = true;
		 
	    for (int i = 2; i < numero; i++) {
	    	
	    	if (numero % i == 0) {
	            ehPrimo = false;
	            break;
	        }
	    }
	    
	    if (ehPrimo && numero != 1)
           System.out.printf("O numero: %d é primo.",numero);
	    
	    else 
           System.out.printf("O numero: %d não é primo",numero);
   
	}
}