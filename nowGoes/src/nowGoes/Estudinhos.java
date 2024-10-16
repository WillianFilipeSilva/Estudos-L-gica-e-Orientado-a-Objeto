package nowGoes;

public class Estudinhos {

	public static void main(String[] args) {
	
		// replicar os codigos de fatorial, primo, fibonacci e imprimir matriz, até que entre na cabeça !
	
		//int[][] matrizA = {{1,2},{1,2}};
		
		int[] vetor = {1, 3, 4, 2, 1, 5, 6};
		
		System.out.println(maiorValor(vetor));

	}
	public static int[] primos (int tamanho) {
		
		int[] primos = new int [tamanho];
		int i = 2;
		int quantidadePrimos = 0;
		
		while (quantidadePrimos != primos.length) {
			
			if (ehPrimo(i)) {
				primos[quantidadePrimos] = i;
				quantidadePrimos++;
			}
		i++;
		}
		return primos;
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
	
	public static int fibonacci (int n) {
		
		if (n < 2) {
			return n;
		}else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
	
	public static int[] calcularFibo (int tamanho) {
		
		int [] vetorFibonacci = new int [tamanho];
		
		int primeiroFibo = 0;
		int segundoFibo = 1;
		int proximoFibo = 1;
		
		
		for (int i = 0; i < vetorFibonacci.length; i++) {
			
			proximoFibo = primeiroFibo + segundoFibo;
			primeiroFibo = segundoFibo;
			segundoFibo = proximoFibo;
			vetorFibonacci[i] = primeiroFibo;
		}
		return vetorFibonacci;
	}
	
	public static void ImprimirMatriz (int [][] matriz) {
		
		for (int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static int MaiorValorVetor (int [] vetorA) {
		
		int numero = vetorA.length;
		
		int [] vetorTeste = new int [vetorA.length];
		
		for (int i = 0; i < numero-1; i++) {
			
			for(int j = 0; j < numero-i-1; j++) {
				
				if (vetorTeste[j] > vetorTeste[j + 1]) {
					int temp = vetorTeste[j];
					vetorTeste[j] = vetorTeste[j+1];
					vetorTeste[j+1] = temp;
				}
			}
		}
		return vetorTeste[vetorA.length-1];
	}

	public static int maiorValor(int[] vetor) {
		
	    int max = vetor[0];
	    
	    for (int i = 1; i < vetor.length; i++) {
	    	
	        if (vetor[i] > max) {
	            max = vetor[i];
	        }
	    }
	    return max;
	}
}
