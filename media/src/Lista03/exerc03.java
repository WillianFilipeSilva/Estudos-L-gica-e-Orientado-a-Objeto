package Lista03;

import java.util.Scanner;

public class exerc03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int numero;
        long produtorioPares = 1;
        System.out.println("Digite um numero inteiro positivo (0 finaliza a sequencia)");
        do{
            numero = scanner.nextInt();
            if (numero % 2 == 0 && numero != 0) {
                produtorioPares *= numero;
            }
        }while (numero != 0);
        scanner.close();
        System.out.println("O produtório dos números pares é: " + produtorioPares);
	}
}
