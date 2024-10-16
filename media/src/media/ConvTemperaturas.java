package media;

import java.util.Scanner;

public class ConvTemperaturas {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bora fazer algumas conversões ?");
		
		System.out.print("Insira a temperatura em Fahrenheit: ");
        double TempF = scanner.nextDouble();
        
        double TempC = (TempF - 32)/1.8;
        System.out.println( TempF +" graus Fahrenheit são: " + TempC + " graus Celsius");
        
        
        scanner.close();

	}

}
