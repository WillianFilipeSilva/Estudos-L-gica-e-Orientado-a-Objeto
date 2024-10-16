package media;

import java.util.Scanner;

public class SalarioFuncionario {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bora fazer o ajuste no seu salário ?");
		
		System.out.print("Insira seu salario em reais: ");
        double salario = scanner.nextDouble();
        System.out.print("Qual o percentual de reajuste em % ? ");
        double percentual = scanner.nextDouble();
        
        double ajuste = salario + ((salario/percentual));
        System.out.println("O seu salario com reajuste foi de: " + ajuste + " R$!");
        
        
        scanner.close();
	}

}
