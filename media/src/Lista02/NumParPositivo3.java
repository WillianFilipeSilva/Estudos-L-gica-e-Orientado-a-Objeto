package Lista02;

import java.util.Scanner;

public class NumParPositivo3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Vamos verificar numeros? ");
		
		System.out.println("Digite um numero para verificar se é par ou impar, positivo ou negativo: \n");
		int numero = scanner.nextInt();
		
		if (numero % 2 == 0) {
			if (numero < 0) {
				System.out.println("O numero é par e negativo! ");
			}
			else {
				System.out.println("o numero é par e e positivo! ");
			}
		}
		else {
			if (numero < 0) {
			System.out.println("O numero é impar e negativo! ");
			}
			else {
			System.out.println("o numero é impar e e positivo! ");
			}
		}
		
		
		
		scanner.close();
	}

}
