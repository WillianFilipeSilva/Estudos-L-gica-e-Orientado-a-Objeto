package lista04;

import java.util.Scanner;

public class Exerc07 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int [] A = new int [20];
		int soma = 0;
		
		System.out.println("Vamos somar numeros inteiros em uma array !");
		
		for (int i = 0; i < A.length; i ++) {
			System.out.println("Digite o " + (i + 1) +" numero");
			int numero = scanner.nextInt();
			A[i] = numero;
			soma += numero;	
		}
		scanner.close();
		System.out.println("A soma dos numeros é: " + soma);

	}

}
