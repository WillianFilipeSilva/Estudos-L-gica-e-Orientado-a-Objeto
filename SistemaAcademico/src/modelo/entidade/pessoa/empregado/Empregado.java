package modelo.entidade.pessoa.empregado;

import modelo.entidade.pessoa.Pessoa;
import modelo.enumeracao.status.Status;
import modelo.excecao.pessoa.IdadeInvalidoException;
import modelo.excecao.pessoa.NomeInvalidoException;
import modelo.excecao.pessoa.SobrenomeInvalidoException;

public abstract class Empregado extends Pessoa {
	
	private float salario;
	
	private Status status;
	
	protected Empregado(String nome, String sobrenome, byte idade, float salario) throws NomeInvalidoException, SobrenomeInvalidoException, IdadeInvalidoException {
		super(nome, sobrenome, idade);
		setSalario(salario);
		setStatus(Status.CONTRATADO);
	}
	
	protected Empregado(String nome, String sobrenome, byte idade, float salario, Status status) throws NomeInvalidoException, SobrenomeInvalidoException, IdadeInvalidoException {
		super(nome, sobrenome, idade);
		setSalario(salario);
		setStatus(status);
	}
	
	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public Status getStatus() {	
		return status;
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}
	
	public abstract float calcularSalario();
	
	public float calcularSalario(float bonus) {
		
		return getSalario() + bonus;
	}
	
	public boolean equals(Object objeto) {
		
		if(objeto == null)
			return false;
		
		if(this == objeto)
			return true;
		
		if(this.getClass() != objeto.getClass())
			return false;
		
		Empregado empregado = (Empregado) objeto;
		
		return this.getNome().equals(empregado.getNome()) 
				&& this.getSobrenome().equals(empregado.getSobrenome()) 
				&& this.getIdade() == empregado.getIdade() 
				&& this.getSalario() == empregado.getSalario() 
				&& this.getStatus() == empregado.getStatus();
	}
					
					
	
	
	
	
	
	
	
	
}