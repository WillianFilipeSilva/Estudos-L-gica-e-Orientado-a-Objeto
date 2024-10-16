package Lista03;

import java.util.Scanner;

public class exerc07 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Vamos calcular se o primeiro numero é fatorial do segundo numero!");
		
		System.out.print("Insira o primeiro numero inteiro e positivo:");
		int primeiroNumero = scanner.nextInt();
		
		System.out.print("Insira o segundo numero inteiro postivo:");
		int segundoNumero = scanner.nextInt();

		scanner.close();
		
		int fatorial = primeiroNumero;
		
		for (int i = primeiroNumero -1; i > 1 ; i--) {
			fatorial *= i;
		}
		
		if(fatorial == segundoNumero) {
			System.out.printf("\nO numero %d é fatorial do numero %d!",segundoNumero , primeiroNumero);
		}
		
		else {	
			System.out.printf("\nO numero %d não é fatorial do numero %d!",segundoNumero , primeiroNumero);
		}
	}

}
