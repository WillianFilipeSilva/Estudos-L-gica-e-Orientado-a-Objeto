package modelo.entidade.pessoa.aluno;

import modelo.entidade.pessoa.Pessoa;
import modelo.excecao.pessoa.IdadeInvalidoException;
import modelo.excecao.pessoa.NomeInvalidoException;
import modelo.excecao.pessoa.SobrenomeInvalidoException;

public class Aluno extends Pessoa{
	
	private String matricula;
	
	public Aluno(String nome, String sobrenome, byte idade) throws NomeInvalidoException, SobrenomeInvalidoException, IdadeInvalidoException {
		super(nome, sobrenome, idade);
	}
	
	public Aluno(String nome, String sobrenome, byte idade, String matricula) throws NomeInvalidoException, SobrenomeInvalidoException, IdadeInvalidoException {
		super(nome, sobrenome, idade);
		setMatricula(matricula);
	}
	
	public void responderChamada() {
		System.out.println(getNome() + " está presente!");
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
}