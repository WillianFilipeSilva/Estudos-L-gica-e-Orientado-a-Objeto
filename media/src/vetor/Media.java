package vetor;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Vamos calcular a media do aluno!\n");
		
		System.out.print("Insira a quantidade de notas do aluno: ");
		int quantidadeNotas = scanner.nextInt();
		
		float[] notas = new float[quantidadeNotas];

		float somatorio  = 0;
		
		float maiorNota = Float.MIN_VALUE;
		
		System.out.println("Agora insira as notas!\n");
		
		for(int i = 0; i < notas.length; i++) {
			System.out.print("Insira a " + (i + 1) + " nota: ");
			notas[i] = scanner.nextFloat();
			
			somatorio += notas[i];
			
			if(notas[i] > maiorNota)
        		maiorNota = notas[i];
		}
		
		scanner.close();
		
		for(int j = 0; j < notas.length; j++) {
			System.out.printf("A %d nota é: %.2f\n",(j + 1), notas[j]);
			
		}
		
		System.out.printf("A Nota mais alta foi: %.2f\n", maiorNota);
		
		System.out.printf("A media foi de %.2f", (somatorio/notas.length));
	}

}
