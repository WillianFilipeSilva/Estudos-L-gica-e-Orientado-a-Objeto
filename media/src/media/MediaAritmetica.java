package media;
import java.util.Scanner;

public class MediaAritmetica {
	
	public static void main(String[]args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de notas: ");
		byte quantidadeDeNotas = scanner.nextByte();

        int somatorioNotas = 0;
        
        for(int i = 0; i < quantidadeDeNotas; i++) {
        	System.out.println("Informe a " + (i + 1) + "º nota: ");
        	somatorioNotas += scanner.nextByte();
        }
        
        System.out.println("Digite a frequencia: ");
        byte frequencia = scanner.nextByte();
        
        scanner.close();
        
        float media = ((float)(somatorioNotas)) / quantidadeDeNotas;
       
        if(media >= 7 && frequencia >=75) {
        	if( frequencia == 100 && media == 10) {
        		System.out.println("Parabens, voce foi aprovado por louvor !!!");
        	}
        	else { 
        	System.out.printf("A sua media foi de: %.2f", media + " e frequencia: " + frequencia+ ", Parabens, você foi Aprovado !");
        	}
        }
        else {
        	if(frequencia <75 && media <7) {
        		System.out.println("Nao foi dessa vez, você foi reprovado! ");
        	}
        	else {
        		if(frequencia <75 && media >=7) {
        			System.out.println("Nao foi dessa vez, sua media foi de: " + media + ", mas você foi reprovado por frequencia.");
        		}
        		else {
        			if(frequencia >=75 && media <7) {
        				System.out.println("Nao foi dessa vez, sua frequencia foi: " + frequencia + ", mas sua media foi de: " + media + ", você foi reprovado por media.");
        			}
        			else {
        				System.out.println("Nao foi dessa vez, sua media foi de: " + media + ", você foi reprovado.");
        			}
        		}
        	}
        }
	}
}
