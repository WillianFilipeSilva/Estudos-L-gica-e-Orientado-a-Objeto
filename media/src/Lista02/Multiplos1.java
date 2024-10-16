package Lista02;

import java.util.Scanner;

public class Multiplos1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Vamos verificar multiplos? ");
		
		System.out.println("Qual o valor de A ");
		int A = scanner.nextInt();
		
		System.out.println("Qual o valor de B ");
		int B = scanner.nextInt();
		
		scanner.close();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println(" Os valores " + A + " e " + B + " são multiplos!");
		}
		else {
			System.out.println("Os valores " + A + " e " + B + " não são multiplos!");
		}
	}

}
