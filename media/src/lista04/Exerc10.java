package lista04;

import java.util.Scanner;

public class Exerc10 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int [] A = new int [10];
		int [] B = new int [10];
		
		System.out.println("Vamos separar os primos do vetorA!");
		
		for (int i = 0; i < A.length; i ++) {
			System.out.println("Digite o " + (i + 1) +" numero");
			A[i] = scanner.nextInt();
			
			if (A[i] % 2 != 0 && A[i] > 1) {
				if (A[i] % 3 != 0) B[i] = A[i];
    		}
    		else B[i] = 0;
		}
		scanner.close();
		for (int i = 0; i < B.length; i ++) {
			if (B[i] > 0) {
				System.out.println("O: " + (i + 1) + " numero é : " + B[i]);	
			}
		}

	}

}
