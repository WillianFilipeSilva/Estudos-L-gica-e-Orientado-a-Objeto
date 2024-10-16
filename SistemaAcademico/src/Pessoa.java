
public abstract class Pessoa {
	
	//variaveis
	private String nome;
	private String sobrenome;
	private byte idade;
	
	//construtor
	protected Pessoa(String nome, String sobrenome, byte idade) {
		super();
		setNome(nome);
		setSobrenome(sobrenome);
		setIdade(idade);
	}
	//getters e setters
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
	public byte getIdade() {
		return idade;
	}
	public void setIdade(byte idade) {
		this.idade = idade;
	}
}