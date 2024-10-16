package lista04;

import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];
        
        for (int i = 0; i < vetorA.length; i++) {
        	
            System.out.println("Insira o " + (i + 1) + "º número do vetor A: ");
            vetorA[i] = scanner.nextInt();
            
            System.out.println("Insira o " + (i + 1) + "º número do vetor B: ");
            vetorB[i] = scanner.nextInt();
          
            vetorC[i] = vetorA[i] + vetorB[i];
        }
        for(int j = 0; j < vetorC.length; j++) {
        	System.out.println(vetorC[j]);
        }
       scanner.close();

	}

}
