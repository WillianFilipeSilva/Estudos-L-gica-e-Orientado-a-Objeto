package lista04;

import java.util.Arrays;

public class Exerc02 {

	public static void main(String[] args) {
		
		int [] primos = new int [10];
		int quantidadePrimos = 0;
		int numeroAtual = 2;
		boolean ehPrimo;
		
		while (quantidadePrimos != 10) {
			ehPrimo = true;
		
				for (int i = 2; i < numeroAtual; i++) {
					
					if (numeroAtual % i == 0) {
		            ehPrimo = false;
		            break;
					}
				}
		    
				if (ehPrimo && numeroAtual != 1) {
					
					primos[quantidadePrimos] = numeroAtual;
					quantidadePrimos++;
				}
				
				numeroAtual++;
		}
		System.out.println(Arrays.toString(primos));
		
	}	
}


