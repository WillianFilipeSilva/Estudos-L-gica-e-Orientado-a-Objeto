package controle.principal;

import modelo.Aluno.Aluno;
import modelo.turma.Turma;

public class Principal {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Joao", "Silva", "01");
		//Aluno aluno2 = new Aluno("Joao", "Silva", "02");
		
		Turma turma1 = new Turma("Java", "Java01");
		Turma turma2 = new Turma("Java02", "Java02");
		
		aluno1.adicionarAlunoTurma(aluno1, turma1);
		aluno1.adicionarAlunoTurma(aluno1, turma2);
		
		aluno1.exibirTurmasMatriculado();
		
		//turma2.adicionarAluno(aluno1,turma2);
		//turma2.adicionarAluno(aluno2,turma2);
		
		turma1.exibirAlunosMatriculados();
		turma2.exibirAlunosMatriculados();
		
	}

}
