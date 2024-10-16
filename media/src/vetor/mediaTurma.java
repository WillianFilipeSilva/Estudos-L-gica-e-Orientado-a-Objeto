package vetor;

import java.util.Scanner;

public class mediaTurma {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Vamos calcular as medias do alunos da turma!\n");
		
		System.out.print("Insira a quantidade de alunos: ");
		int quantidadeAlunos = scanner.nextInt();
		
		System.out.print("Insira a quantidade de notas do aluno: ");
		int quantidadeNotas = scanner.nextInt();
		
		float[] medias = new float[quantidadeAlunos];
		float somatorioNotas  = 0;
		float somatorioMedias = 0;
		float maiorMedia = Float.MIN_VALUE;
		
		System.out.println("Agora insira as notas!\n");
		
		for(int i = 0; i < quantidadeAlunos; i++) {

			somatorioNotas = 0;
			
			for(int j = 0; j < quantidadeNotas; j ++) {
				System.out.print("Insira a " + (j + 1) + " nota do " + (j + 1) + " aluno:");
				somatorioNotas += scanner.nextFloat();
			}
			
			medias[i] = somatorioNotas/quantidadeNotas;
			somatorioMedias += medias[i];
			
			if (medias[i] > maiorMedia) {
				maiorMedia = medias[i];
			}
		}
		
		scanner.close();
		
		System.out.println("As medias dos alunos foram: ");
		
		for(float media : medias) 
			System.out.println(media);
		
		System.out.printf("A Nota mais alta foi: %.2f\n", maiorMedia);
		
		System.out.printf("A media foi de %.2f", (somatorioMedias / quantidadeAlunos));

	}

}
