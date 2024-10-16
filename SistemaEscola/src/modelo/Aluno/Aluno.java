package modelo.Aluno;

import java.util.HashSet;
import java.util.Set;

import modelo.turma.Turma;

public class Aluno {

	private String nome;
	private String sobrenome;
	private String Matricula;
	Set<Turma> turmasMatriculado;
	
	public Aluno(String nome, String sobrenome, String matricula) {
		this.setNome(nome);
		this.setSobrenome(sobrenome);
		this.setMatricula(matricula);
		this.turmasMatriculado = new HashSet<Turma>();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getMatricula() {
		return Matricula;
	}

	public void setMatricula(String matricula) {
		Matricula = matricula;
	}
	
	public Set<Turma> getTurmasMatriculado() {
		return turmasMatriculado;
	}
	
	public void excluirTurma(Turma turma) {
		turmasMatriculado.remove(turma);
	}
	
	public void turmasMatriculado(Turma turma) {
		this.turmasMatriculado.add(turma);
	}
	
	public void adicionarAlunoTurma(Aluno aluno, Turma turma) {
		if(verificarTurma(turma)) {
			System.out.println("Aluno já está na turma!");
		}
		turmasMatriculado.add(turma);
		turma.alunosMatriculados(aluno);;
	}
	
	public boolean verificarTurma (Turma turma) {
		for(Turma turm : this.turmasMatriculado) {
			if(turm.equals(turma)) {
				return true;
			}
		}
		return false;
	}
	
	public void exibirTurmasMatriculado() {
		for(Turma turma : this.turmasMatriculado) {
			System.out.println(turma.getNomeTurma());
		}
	}
	
	public boolean equals(Aluno obj) {
		if(this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getMatricula() == obj.getMatricula())
			return true;
		return false;
	}
	
}
