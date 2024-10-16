package Lista03;

import java.util.Scanner;

public class exerc09 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Vamos calcular o valor de E\n"
				+ "E = 1 + 1 / 1! + 1 / 2! + 1 / 3! + ... + 1 / N");
		
		System.out.println("Insira um valor inteiro e positivo para ser o N:");
		int valorN = scanner.nextInt();
		
		scanner.close();
		
		double numeroEuler = 1;
		long fatorial = 0;
		
		for (int i = 1; i <= valorN; i++) {
			
			fatorial = i;
			
			for(int j = i - 1; j > 1; j--) 
				fatorial *= j;
				
			numeroEuler += 1f / fatorial;
			
		}
		System.out.println("Resultado: " + numeroEuler); 
	}
}
