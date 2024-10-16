package Lista03;

import java.util.Scanner;

public class fatorial {

	public static void main(String[] args) {
		
		System.out.println("Vamos tirar o fatorial de um numero !");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira um numero:");
		int numero = scanner.nextInt();
		
		scanner.close();
		
		int resultado = 1;
		
		for (int i = numero; i >= 1 ; i--) {
			resultado *= i;
		}
		System.out.printf("O fatorial de %d é: %d.", numero, resultado);
		
	}

}
