package media;

import java.util.Scanner;

public class MediaPonderada {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota:");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Digite a segunda nota:");
        double nota2 = scanner.nextDouble();
        
        System.out.print("Digite a terceira nota:");
        double nota3 = scanner.nextDouble();
        
        double media = (nota1 * 0.2)+(nota2 * 0.3)+(nota3 * 0.5);
        System.out.println("a sua media é de: " + media);
        
        
        scanner.close();
	}

}
