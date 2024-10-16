package media;

import java.util.Scanner;

public class Eleições {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("contagem das votos da eleição");
		
		System.out.print("Qual a quantidade total de eleitores ?");
        int eleitores = scanner.nextInt();
		System.out.print("Qual a quantidade  de votos brancos ?");
        int votosBrancos = scanner.nextInt();
        System.out.print("Qual a quantidade  de votos nulos ?");
        int votosNulos = scanner.nextInt();
        System.out.print("Qual a quantidade  de votos válidos ?");
        int votosValidos = scanner.nextInt();
        
        double porcentagemBrancos = (double)votosBrancos / eleitores * 100;
        System.out.printf("A porcentagem de votos brancos é: %.2f%%\n", porcentagemBrancos);
        
        double porcentagemNulos = (double)votosNulos / eleitores * 100;
        System.out.printf("A porcentagem de votos nulos é: %.2f%%\n", porcentagemNulos);
        
        double porcentagemValidos = (double)votosValidos / eleitores * 100;
        System.out.printf("A porcentagem de votos válidos é: %.2f%%\n", porcentagemValidos);
        if(porcentagemValidos >= 50)
        	System.out.println("Eleição aprovada!");
        else
        	System.out.println("Eleição Nula");
		
		
		scanner.close();
	}

}
