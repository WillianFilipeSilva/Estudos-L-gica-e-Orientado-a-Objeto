package lista04;

import java.util.Scanner;

public class Exerc09 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];
        int numeroAnteriorA;
        int numeroAnteriorB; 
 
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número para o vetor A: ");
            vetorA[i] = scanner.nextInt();

            System.out.println("Digite o " + (i + 1) + "º número para o vetor B: ");
            vetorB[i] = scanner.nextInt();
        }
        scanner.close();
        for (int i = 0; i < vetorA.length -1; i++) {
			for(int j = 0; j < vetorA.length - 1 - i; j++) {
				if (vetorA[j] < vetorA[j + 1]) {
					numeroAnteriorA = vetorA[j];
					vetorA[j] = vetorA[j +1 ];
					vetorA[j + 1] = numeroAnteriorA;
				}
				if (vetorB[j] < vetorB[j + 1]) {
					numeroAnteriorB = vetorB[j];
					vetorB[j] = vetorB[j +1 ];
					vetorB[j + 1] = numeroAnteriorB;
				}
			}
        }
        for (int j = 0; j < vetorC.length; j++) {
        	vetorC[j] = vetorA[j] + vetorB[j];
            System.out.println(vetorC[j]);
        }

	}

}
