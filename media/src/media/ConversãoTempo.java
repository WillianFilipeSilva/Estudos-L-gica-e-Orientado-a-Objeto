package media;

import java.util.Scanner;

public class ConversãoTempo {

	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bora fazer algumas conversões ?");
		
		System.out.println("Digite a idade em dias:");
        int dias = scanner.nextInt();
        if (dias >= 365){
        	int anos = dias / 365;
            dias = dias % 365;
            int meses = dias / 30;
            dias = dias % 30;
            System.out.println("A idade é: " + anos + " anos, " + meses + " meses e " + dias + " dias.");
        }
        
        else {
            dias = dias % 365;
            int meses = dias / 30;
            dias = dias % 30;
            System.out.println("A idade é: " + meses + " meses e " + dias + " dias.");
            
        }
        
        scanner.close();

	}

}
