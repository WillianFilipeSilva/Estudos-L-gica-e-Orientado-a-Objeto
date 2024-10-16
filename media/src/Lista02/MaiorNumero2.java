package Lista02;

import java.util.Scanner;

public class MaiorNumero2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Vamos qual o maior numero ? ");

		System.out.println("Qual o valor do primeiro numero ");
		int primNum = scanner.nextInt();
		System.out.println("Qual o valor do segundo numero ");
		int segNum = scanner.nextInt();
		System.out.println("Qual o valor do terceiro numero ");
		int tercNum = scanner.nextInt();

		int maior = primNum;

		if (maior < segNum)
			maior = segNum;
		if (maior < tercNum)
			maior = tercNum;

		System.out.println("O maior número é: " + maior);

		scanner.close();

	}

}
