package Lista03;

import java.util.Scanner;

public class exerc04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
        int valor = 0;
        int somatorio = 0;
        int maiorValor = Integer.MIN_VALUE;
        int menorValor = Integer.MAX_VALUE;
        
       
        for(int i = 0; i < 10; i++) {
  
        	System.out.println("Informe o " + (i + 1) + " valor: ");
        	valor = scanner.nextInt();
        	somatorio += valor;
        	
        	if(valor > maiorValor)
        		maiorValor = valor;
        	
        	if(valor < menorValor)
        		menorValor = valor;
        }
        
        scanner.close();
        
        System.out.println("\nO maior valor lido foi: " + maiorValor);

        System.out.println("O menor valor lido foi: " + menorValor);

        System.out.println("A media dos valores lidos é: " + (somatorio / 10f));
        
	}
}