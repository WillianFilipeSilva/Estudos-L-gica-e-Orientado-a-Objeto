package Lista03;

import java.util.Scanner;

public class potencia {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);	

		System.out.println("Qual valor de a");
		int base = scanner.nextInt();

		System.out.println("Qual valor de b");
		int expoente = scanner.nextInt();

		scanner.close();

		int resultado = 1;

		for (int i = 0; i < expoente; i++)
			resultado *= base;

		System.out.printf("O resultado de %d elevado a %d é: %d",base, expoente, resultado);
		
	}

}
