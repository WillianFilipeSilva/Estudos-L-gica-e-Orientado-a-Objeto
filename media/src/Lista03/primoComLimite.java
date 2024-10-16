package Lista03;

import java.util.Scanner;

public class primoComLimite {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Vamos verificar os números primos até o seu número!");
		
		System.out.println("Insira um número positivo para ser o limite:");
		int valorLimite = scanner.nextInt();
		
		scanner.close();
		
		boolean ehPrimo = true;
		
	    for (int i = 2; i <= valorLimite; i++) {
	    	
	    	ehPrimo = true;
	    	
	    	for(int j = 2; j < i; j++) {
	    		
	    		if (i % j == 0) {
	    			ehPrimo = false;
	    			break;
	    		}
	    		
	    	}
	    	if (ehPrimo) {
	    		System.out.println(i);
	    	}
	    	
	    }   
	}
}