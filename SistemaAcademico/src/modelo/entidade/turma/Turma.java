package modelo.entidade.turma;

import java.util.ArrayList;
import java.util.List;

import modelo.entidade.pessoa.aluno.Aluno;

public class Turma {
	
	private String nome;
	private String codigo;
	private byte cargaHoraria;
	private List<Aluno> alunos; 
	
	public Turma(String nome, String codigoString, byte cargaHoraria) {
		setNome(nome);
		setCodigo(codigo);
		setCargaHoraria(cargaHoraria);
		alunos = new ArrayList<Aluno>();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public byte getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(byte cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public List<Aluno> getAlunos() {
		return alunos;
	}
	
	public boolean inserirAluno(Aluno aluno) {
		
		return alunos.add(aluno);
	}
	
	public boolean removerAluno(Aluno aluno) {
		
			return alunos.remove(aluno);
	}
}