package media;

import java.util.Scanner;

public class VendaDeCarros {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Calculo de salário\n" + "Insira os dados pedidos abaixo !");
		
		System.out.print("Quantidade Carros Foram vendidos pelo vendedor: ");
        double qtdCarros = scanner.nextDouble();
		System.out.print("Valor total em vendas: ");
        double valorTotal = scanner.nextDouble();
        System.out.print("Valor fixo de salário: ");
        double fixo = scanner.nextDouble();
        System.out.print("Quantidade ganha por carro vendido: ");
        double comissaoFix = scanner.nextDouble();
        double salario = fixo + (qtdCarros * comissaoFix) + (valorTotal * 0.05);

        System.out.println("O seu salario foi de: " + salario + " R$!");
        
        scanner.close();
        
	}

}
