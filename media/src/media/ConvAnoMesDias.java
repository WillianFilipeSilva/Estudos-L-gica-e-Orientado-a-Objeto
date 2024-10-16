package media;

import java.util.Scanner;

public class ConvAnoMesDias {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de anos: ");
        int anos = scanner.nextInt();

        System.out.println("Digite a quantidade de meses: ");
        int meses = scanner.nextInt();

        System.out.println("Digite a quantidade de dias: ");
        int dias = scanner.nextInt();

        int totalDias = anos * 365 + meses * 30 + dias;

        System.out.println("Você tem " + totalDias + " dias de idade! ");
        
        
        scanner.close();

	}

}
