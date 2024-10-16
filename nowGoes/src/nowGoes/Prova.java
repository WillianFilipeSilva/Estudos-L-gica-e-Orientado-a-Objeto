package nowGoes;

public class Prova {

	public static void main(String[] args) {
		
		// criar função para retornar o fatorial de um numero. X
		// criar função para retornar se um numero é primo. X
		// criar vetor de 5 primeiros primos. X
		// criar vetor de 5 primeiros termos fibonacci. X
		// criar função que retorne o maior valor do vetor / matriz. X
		// criar um vetor de 3 numeros perfeitos. 
		
		int [][] primos = {{45,3,1},{4,5,2},{3,4,7}};
		
		imprimirMatriz(primos);
		
		//System.out.println(Arrays.toString(criarVetorPerfeitos(3)));
		
	}
	
	public static long fatorial (int valor) {
		
		long resultado = 1;
		
		for (int i = 2; i <= valor; i++) {
			 resultado *= i;
		}
		return resultado;
	}
	
	public static boolean ehPrimo (int valor) {
		
		if (valor <= 1) {
			return false;
		}
		for (int i = 2; i < valor; i++) {
			if (valor % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static int[] criarVetorPrimos (int tamanho) {
		
		int [] primos = new int [tamanho];
		
		int quantidadePrimos = 0;
		int numeros = 2;
		
		while(quantidadePrimos != primos.length) {
			if (ehPrimo(numeros)) {
				primos[quantidadePrimos] = numeros;
				quantidadePrimos++;
			}
			
			numeros++;
		}
		return primos;
		
	}
	
	public static int[] criarVetorFibonacci (int tamanho) {
		
		int[] fibonacci = new int [tamanho];
		
		int primeiroFibo = 0;
		int segundoFibo = 1;
		int proximoFibo = 1;
		
		for (int i = 0; i < fibonacci.length; i++) {
			
			proximoFibo = primeiroFibo + segundoFibo;
			primeiroFibo = segundoFibo;
			segundoFibo = proximoFibo;
			fibonacci[i] = primeiroFibo; 
		}
		
		return fibonacci;
	}
	
	public static int maiorValor (int[] vetor) {
		
		int maior =  vetor[0];
		
		for (int i = 0; i < vetor.length; i++) {
			if (maior < vetor[i]) {
				maior = vetor[i];
			}
		}
		
		return maior;
	}
	
	public static int maiorValorMatriz (int[][] matriz) {
		
		int maior =  matriz[0][0];
		
		for (int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if (maior < matriz[i][j]) {
					maior = matriz[i][j];
				}
			}
		}
		
		return maior;
	}
	
	public static int [] criarVetorPerfeitos (int tamanho) {
		
		int [] perfeitos = new int [tamanho];
		
		int numeros = 6;
		int quantidadePerfeitos = 0;
		
		while(quantidadePerfeitos != perfeitos.length) {
			int soma = 0;
			
			for (int i = 1; i < numeros; i++) {
				 if (numeros % i == 0) {
					soma += i;
				 }
			}
			if (soma == numeros) {
				perfeitos[quantidadePerfeitos] = numeros;
				quantidadePerfeitos++;
			}
			
			numeros++;
		}
		
		return perfeitos;
	}
	
	public static void imprimirMatriz (int[][] matriz) {
		
		for (int i = 0; i < matriz.length; i++) {
			for(int j = 0 ; j < matriz[i].length; j++) {
				
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	
	
	

}
