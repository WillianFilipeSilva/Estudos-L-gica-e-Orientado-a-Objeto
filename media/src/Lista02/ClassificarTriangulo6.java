package Lista02;

import java.util.Scanner;

public class ClassificarTriangulo6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Vamos Verificar se a sua forma é um triangulo");

		System.out.println("Digite o primeiro lado");
        double lado1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo lado");
        double lado2 = scanner.nextDouble();
        
        System.out.println("Digite o terceiro lado");
        double lado3 = scanner.nextDouble();
        
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
        	
        	if (lado1 == lado2 && lado2 == lado3) {
        		System.out.println("É um triangulo Equilátero!");
        	}
        	if ( lado1 == lado2 || lado1 == lado3|| lado2 == lado3 ) {
        		System.out.println("É um Isóceles!");
        	}
        	if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
        		System.out.println("É um triangulo Escaleno!");
        	}
        }
        else {
        	System.out.println("Não é um triangulo");
        }
        
        scanner.close();

	}

}
