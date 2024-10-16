package Lista03;

import java.util.Scanner;

public class exerc06 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Vamos calcular o fatoria do seu numero!");
		System.out.println("Insira um numero inteiro e positivo:");
		int numero = scanner.nextInt();
		scanner.close();
		
		int resultado = 1;
		
		for (int i = numero; i >= 1 ; i--) {
			resultado *= i;
		}
		System.out.printf("O fatorial de %d é: %d.", numero, resultado);
	}

}
