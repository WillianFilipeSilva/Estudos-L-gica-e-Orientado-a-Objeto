package Lista02;

import java.util.Scanner;

public class ClassificaçaoNatação7 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Classificação de participantes");

		System.out.println("Digite a idade do nadador");
        byte idade = scanner.nextByte();
        
        scanner.close();
        
        if(idade >=5 && idade <=7) {
        	System.out.println("Categoria 5 a 7 anos: Infantil A");
        } else {
        	
        	if(idade >=8 && idade <=10) {
        		System.out.println("Categoria 8 a 10 anos: Infantil B");
        	} else {
        		
        		if(idade >=11 && idade <=13) {
        			System.out.println("Categoria 11 a 13 anos: Juvenil A");
        		} else {
        			
        			if(idade >=14 && idade <=17) {
        	        	System.out.println("Categoria 14 a 17 anos: Juvenil B");
        	        } else {
        	        	System.out.println("Categoria + 18 anos: Adulto");
        	        }
        		}
        	}
        }
	}
}
