package Lista02;

import java.util.Scanner;

public class MediaPonderada8 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Vamos calcular sua media!");
		
		System.out.print("Digite a primeira nota:");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Digite a segunda nota:");
        double nota2 = scanner.nextDouble();
        
        System.out.print("Digite a terceira nota:");
        double nota3 = scanner.nextDouble();
        
        double media = (nota1 * 0.4)+(nota2 * 0.3)+(nota3 * 0.3);
        if (media >= 7) {
        System.out.println("Você foi aprovado!");
        }
        else {
        	System.out.println("Você foi reprovado");
        }
        scanner.close();

	}

}
