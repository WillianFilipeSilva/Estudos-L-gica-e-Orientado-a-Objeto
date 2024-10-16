package Lista03;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {

		System.out.println("Sequencia fibonacci!");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("qual a posição do numero que voce quer?");
		int posicao = scanner.nextInt();
		
		scanner.close();
		
		int primeiroFibonacci = 1;
		int segundoFibonacci = 1;
		int proximoFibonacci = 1;
		
		for (int i = 1; i < posicao; i++) {
			
			proximoFibonacci = primeiroFibonacci + segundoFibonacci;
			primeiroFibonacci = segundoFibonacci;
			segundoFibonacci = proximoFibonacci;
		}
		
		System.out.printf("\nO %dº numero da sequencia fibonacci é: %d.", posicao, primeiroFibonacci);
	}

}
