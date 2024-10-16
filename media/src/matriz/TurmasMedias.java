package matriz;

import java.util.Scanner;

public class TurmasMedias {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Insira a quantidade de turmas: ");
		int quantidadeTurmas = scanner.nextInt();
		
		System.out.print("Insira a quantidade de alunos: ");
		int quantidadeAlunos = scanner.nextInt();
		
		System.out.print("Insira a quantidade de notas do aluno: ");
		int quantidadeNotas = scanner.nextInt();
		
		
		float somatorioNotas  = 0;
		float somatorioMedias = 0;
		float somatorioMediaGeral = 0;
		
		int indiceMaiorTurma = 0;
		int indiceMaiorAluno = 0;
		
		float[][] mediasAlunos = new float[quantidadeTurmas][quantidadeAlunos];
		float[] mediasTurmas = new float[quantidadeTurmas];
		
		System.out.println();
		
		for(int i = 0; i < quantidadeTurmas; i++) {
			
			somatorioMedias = 0;
		
			for(int j = 0; j < quantidadeAlunos; j++) {
				
				somatorioNotas = 0;
				
				for(int k = 0; k < quantidadeNotas; k ++) {
					
					System.out.print("Insira a " + (k + 1) + " nota do " + (j + 1) + " aluno da " + (i+1) + " turma\n");
					somatorioNotas += scanner.nextFloat();
				}
				
				mediasAlunos[i][j] = somatorioNotas / quantidadeNotas;
				
				if(mediasAlunos[i][j] > mediasAlunos[indiceMaiorTurma][indiceMaiorAluno]) {
					indiceMaiorTurma = i;
					indiceMaiorAluno = j;
				}

				somatorioMedias += mediasAlunos[i][j];
			}
			
			mediasTurmas[i]  = somatorioMedias / quantidadeTurmas;
			somatorioMediaGeral +=  mediasTurmas[i];
		}
		
		scanner.close();
		
		for(int i = 0; i < quantidadeTurmas; i++){
			
			System.out.println("\nAS medias dos alunos da " + (i + 1) + " turma");
			
			for (int j = 0; i < quantidadeAlunos; i++) {
				
				System.out.println(mediasAlunos[i][j]);
			}
			
			System.out.println("\nA media da turma foi de " + mediasTurmas[i]);
			System.out.println("\nA media geral das turmas foi de " + (somatorioMediaGeral/quantidadeTurmas));
			
			System.out.println("A turma com a maior media foi: " + (indiceMaiorTurma +1));
			System.out.println("O aluno com a maior media foi: " + (indiceMaiorAluno +1));
			System.out.println("A maior media foi: " + (mediasAlunos[indiceMaiorTurma][indiceMaiorAluno]));
		}
		
	}
}
