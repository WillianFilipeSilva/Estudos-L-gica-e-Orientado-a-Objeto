package lista04;

import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Insira o " + (i + 1) + "º número do vetor A: ");
            vetorA[i] = scanner.nextInt();

            vetorB[i] = 1;

            for (int k = vetorA[i]; k >= 1; k--) {
                vetorB[i] *= k;
            }
            System.out.println("Fatorial de " + vetorA[i] + ": " + vetorB[i]);
        }
        scanner.close();
	}
}
