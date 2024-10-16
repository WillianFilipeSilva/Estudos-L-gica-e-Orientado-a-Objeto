package modelo.entidade.pessoa;

import modelo.excecao.pessoa.IdadeInvalidoException;
import modelo.excecao.pessoa.NomeInvalidoException;
import modelo.excecao.pessoa.SobrenomeInvalidoException;

public abstract class Pessoa {
	
	//variaveis
	private String nome;
	private String sobrenome;
	private byte idade;
	
	//construtor
	protected Pessoa(String nome, String sobrenome, byte idade) throws NomeInvalidoException, SobrenomeInvalidoException, IdadeInvalidoException {
		super();
		setNome(nome);
		setSobrenome(sobrenome);
		setIdade(idade);
	}
	
	//getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) throws NomeInvalidoException {
		
		if(nome.isBlank() || nome.length() < 3)
			throw new NomeInvalidoException("O nome: " + nome + " é invalido!");
			
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) throws SobrenomeInvalidoException {
		
		if(sobrenome.isBlank() || sobrenome.length() < 3)
			throw new SobrenomeInvalidoException("O sobrenome: " + sobrenome +" é invalido!");
		
		this.sobrenome = sobrenome;
	}
	public byte getIdade() {
		return idade;
	}
	public void setIdade(byte idade) throws IdadeInvalidoException {
		
		if(idade < 7 || idade > 120)
			throw new IdadeInvalidoException("a Idade: " + idade + " é invalida!");
		
		this.idade = idade;
	}
}