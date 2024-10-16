package media;

import java.util.Scanner;

public class Retangulo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ola, vamos calcular a are de um retangulo ?");
		System.out.print("Digite a base do retangulo!");
        double base = scanner.nextDouble();
        
        System.out.print("Digite a altura do retangulo!");
        double altura = scanner.nextDouble();
        
        double area = base * altura;
        
        System.out.println("A area do retangulo é " + area);
        
        scanner.close();
		

	}

}
