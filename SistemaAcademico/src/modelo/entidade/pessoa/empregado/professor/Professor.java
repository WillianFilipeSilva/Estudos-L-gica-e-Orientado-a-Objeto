package modelo.entidade.pessoa.empregado.professor;

import modelo.entidade.pessoa.empregado.Empregado;
import modelo.excecao.pessoa.IdadeInvalidoException;
import modelo.excecao.pessoa.NomeInvalidoException;
import modelo.excecao.pessoa.SobrenomeInvalidoException;

public class Professor extends Empregado {
	
	public Professor(String nome, String sobrenome, byte idade, float salario) throws NomeInvalidoException, SobrenomeInvalidoException, IdadeInvalidoException {
		super(nome, sobrenome, idade, salario);
	}

	public float calcularSalario() {
		return getSalario() * 1.1f;
	}
	
	public void fazerChamada() {
		System.out.println("Iniciando a chamada!\n");
	}
	
}