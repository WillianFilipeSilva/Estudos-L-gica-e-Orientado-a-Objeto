
import java.util.Arrays;

public class Teste {

	public static void main(String[] args) {
		
		// Criar matrizA 3x3 com numeros primos. X
		
		// Criar matrizB 3x3 com fibonacci. X
		
		// Criar matrizC 3x3 = matrizA - matrizB. X
		
		// Criar matrizAC 3x3 = matrizA * matrizC. X
		
		// Criar uma função que retorna a soma da matrizAC. X
		
		// fazer o calculo de Euler com a da soma da matrizAC % a soma da matrizBC. X
		
		// imprimir a diagonal principal da matrizA. X
		
		// função para criar um vetor com a quantidade pedida de numeros perfeitos. X
		
		//int [][] matrizA = criarMatrizPrimos(3, 3);
		
		//int [][] matrizB = criarMatrizFibonacci(3, 3);
		
		//int [][] matrizC = subtrairMatrizes(matrizA, matrizB);
		
		//int [][] matrizAC = multiplicarMatrizes(matrizA, matrizC);
		
		//int [][] matrizBC = multiplicarMatrizes(matrizB, matrizC);
		
		//imprimirMatriz(matrizAC);
		
		//System.out.println(calcularEuler(somarElementos(matrizAC) % somarElementos(matrizBC)));
		
		//System.out.println(Arrays.toString(diagonalMatriz(matrizA)));
		
		System.out.println(Arrays.toString(numerosPerfeitos(3)));
		
	}
	
	public static long[] numerosPerfeitos(int quantidade) {
		
		long[] perfeitos = new long[quantidade];
		
		int quantidadePerfeitosEncontrada = 0;
		int numeros = 6;
		
		while(quantidadePerfeitosEncontrada  != perfeitos.length) {
			int soma = 0;
			
			for (int j = numeros -1; j > 0; j--) {
				if (numeros % j == 0) {
					soma += j;
				}
			}
			if (soma == numeros) {
				perfeitos[quantidadePerfeitosEncontrada] = soma;
				quantidadePerfeitosEncontrada++;
			}
			
			numeros++;
		}
		return perfeitos;
	}
	
	 public static int[] diagonalMatriz(int[][] matriz) {
		 
		 int [] diagonal = new int [matriz.length];
		 
		 for (int i = 0; i < matriz.length; i++) {
			 
			 diagonal[i] = matriz[i][i];
		 }
		 
		 return diagonal;
	 }
	
	public static int somarElementos (int[][] matriz) {
		
		int soma = 0;
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz.length; j++) {
				soma += matriz[i][j];
			}
			
		}
		return soma;
	}
	
	public static int[][] multiplicarMatrizes(int[][] matriz, int[][]matriz1){
		
		int[][] matrizAC = new int [matriz.length][matriz[0].length];
		
		for(int i = 0; i < matriz.length; i++) {
			
			for(int j = 0; j < matriz[i].length; j++) {
				
				for(int k = 0; k < matriz1[i].length; k++) {
					
					matrizAC[i][j] += matriz[i][k] * matriz1[k][j];
				}
			}
		}
		return matrizAC;
	}
	
	public static int[][] subtrairMatrizes(int[][] matriz, int[][]matriz1) {
		
		int [][] matrizC = new int [matriz.length][matriz[0].length];
		
		for (int i = 0; i < matriz.length; i++) {
	        for (int j = 0; j < matriz[i].length; j++) {
	            
	        	matrizC[i][j] = matriz[i][j]- matriz1[i][j];   
	        }
	    }
		return matrizC;
	}
	
	public static int[][] criarMatrizFibonacci(int linhas,int colunas) {
		
		int [][] matrizB = new int [linhas][colunas];
		
		int proximofibo = 1;
		int primeirofibo = 1;
		int segundofibo = 1;
		
		for (int i = 0; i < matrizB.length; i++) {
			
			for (int j = 0; j < matrizB[i].length; j++) {
				matrizB[i][j] = primeirofibo;
				proximofibo = primeirofibo + segundofibo;
				primeirofibo = segundofibo;
				segundofibo = proximofibo;
				
			}
		}
		return matrizB;
	}
	
	public static void imprimirMatriz(int[][] matriz) {
		
	    for (int i = 0; i < matriz.length; i++) {
	        for (int j = 0; j < matriz[i].length; j++) {
	            System.out.print(matriz[i][j] + " ");
	        }
	        System.out.println();
	    }
	}
	
	public static int[][] criarMatrizPrimos(int linhas,int colunas) {
		
		int[][] matrizA = new int [linhas][colunas];
		int numero = 2;
		
		for (int i = 0; i < matrizA.length; i++) {
			
			for (int j = 0; j < matrizA[i].length; j++) {
				
				while (matrizA[i][j] != (numero-1)) {
					if (ehPrimo(numero)) {
						matrizA[i][j] = numero;
					}
					
				numero++;
				}
			}
		}
		return matrizA;
	}
	
	public static long fatorial(int n) {
		
	    long resultado = 1;
	    for (int i = 2; i <= n; i++) {
	        resultado *= i;
	    }
	    return resultado;
	}

	public static boolean ehPrimo(int n) {
		
	    if (n <= 1) {
	        return false;
	    }
	    for (int i = 2; i < n; i++) {
	        if (n % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}
	
	public static float calcularEuler(long valor) {
		
		float e = 1;
		
		for(int i = 1; i <= valor; i++) {
			e += 1f / fatorial(i);
		}
		return e;
	}
}