package lista04;

public class Exerc08 {

	public static void main(String[] args) {
		
		int [] A = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		
		System.out.println("Vamos ordenar numeros de uma array em forma crescente!");
		
		for (int i = 0; i < A.length -1; i++) {
			
			for(int j = 0; j < A.length - 1 - i; j++) {
				
				if (A[j] > A[j + 1]) {
					
					int numeroAnterior = A[j];
					A[j] = A[j +1 ];
					A[j + 1] = numeroAnterior;
				}
			}
		}
		for (int i = 0; i < A.length; i++)
			System.out.println(A[i]);
		

	}

}
