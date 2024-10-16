package modelo.entidade.pessoa.empregado.diretor;

import modelo.entidade.pessoa.empregado.Empregado;
import modelo.entidade.pessoa.empregado.RH;
import modelo.enumeracao.status.Status;
import modelo.excecao.pessoa.IdadeInvalidoException;
import modelo.excecao.pessoa.NomeInvalidoException;
import modelo.excecao.pessoa.SobrenomeInvalidoException;

public class Diretor extends Empregado implements RH {
	
	public Diretor (String nome, String sobrenome, byte idade, float salario) throws NomeInvalidoException, SobrenomeInvalidoException, IdadeInvalidoException {
		super(nome, sobrenome, idade, salario);
	}
	
	public float calcularSalario() {
		return getSalario() * 1.5f;
	}
	
	public void contratarEmpregado(Empregado empregado) {
		empregado.setStatus(Status.CONTRATADO);
	}
	
	public void demitirEmpregado(Empregado empregado) {
		empregado.setStatus(Status.DEMITIDO);
	}
}