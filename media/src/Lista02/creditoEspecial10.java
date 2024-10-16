package Lista02;

import java.util.Scanner;

public class creditoEspecial10 {

	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
		
		System.out.println("Calculador de credito especial");

		System.out.println("Entre com seu saldo medio no ultimo ano:\n");
		double saldoMedio = scanner.nextDouble();
        
        scanner.close();
        
        if(saldoMedio > 0  && saldoMedio >= 200) {
        	System.out.println("Você não esta apto a receber o especial.");
        } else {
        	
        	if(saldoMedio >200 && saldoMedio <=400) {
        		System.out.println("20");
        	} else {
        		
        		if(saldoMedio >400 && saldoMedio <=600) {
        			System.out.println("30");
        		} else {
        			
        			if(saldoMedio >600) {
        	        	System.out.println("40");
        	        } else {
        	        	System.out.println("Insira um valor válido!");
        	        }
        		}
        	}
        }
		

	}

}
