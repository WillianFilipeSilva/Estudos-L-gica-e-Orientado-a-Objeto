
public class Aluno extends Pessoa{
	
	private String matricula;
	
	public Aluno(String nome, String sobrenome, byte idade) {
		super(nome, sobrenome, idade);
	}
	
	public Aluno(String nome, String sobrenome, byte idade, String matricula) {
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