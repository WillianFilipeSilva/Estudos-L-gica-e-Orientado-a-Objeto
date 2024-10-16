package media;

import java.util.Scanner;

public class CustoCarro {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Calculos de custo !");
		
		System.out.print("Qual o custo de fabrica do carro ?");
        float custoFab = scanner.nextFloat();
        
        float percDist = custoFab * 0.28f;
        float Impost = custoFab * 0.45f;
        float custoCons = custoFab + Impost + percDist;
        
        System.out.printf("O preço final para o consumidor é: " + custoCons);
        
		scanner.close();
	}

}
