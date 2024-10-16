package modelo.turma;

import java.util.HashSet;
import java.util.Set;

import modelo.Aluno.Aluno;

public class Turma {
	
	private String nomeTurma;
	private String id;
	Set<Aluno> alunosMatriculados;
	
	public Turma(String nomeTurma, String id) {
		this.setNomeTurma(nomeTurma);
		this.setId(id);
		this.alunosMatriculados = new HashSet<Aluno>();
	}
	
	public String getNomeTurma() {
		return nomeTurma;
	}

	public void setNomeTurma(String nomeTurma) {
		this.nomeTurma = nomeTurma;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public Set<Aluno> getAlunosMatriculados() {
		return alunosMatriculados;
	}

	public void alunosMatriculados(Aluno aluno) {
		this.alunosMatriculados.add(aluno);
	}
	public void adicionarAluno(Aluno aluno, Turma turma) {
		if(verificarAluno(aluno)) {
			System.out.println("Aluno já está na turma!");
		}
		alunosMatriculados.add(aluno);
		aluno.turmasMatriculado(turma);
	}
	
	public boolean verificarAluno (Aluno aluno) {
		for(Aluno alun : this.alunosMatriculados) {
			if(alun.equals(aluno)) {
				return true;
			}
		}
		return false;
	}
	
	public void excluirAluno(Aluno aluno) {
		alunosMatriculados.remove(aluno);
	}
	
	public void exibirAlunosMatriculados() {
		for(Aluno aluno : this.alunosMatriculados) {
			System.out.println(aluno.getNome());
		}
	}
	
	public boolean equals(Turma obj) {
		if(this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getId() == obj.getId())
			return true;
		return false;
	}
}

