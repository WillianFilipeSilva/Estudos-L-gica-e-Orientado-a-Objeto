
public abstract class Empregado extends Pessoa {
	
	private float salario;
	
	private Status status;
	
	protected Empregado(String nome, String sobrenome, byte idade, float salario) {
		super(nome, sobrenome, idade);
		setSalario(salario);
		setStatus(Status.CONTRATADO);
	}
	
	protected Empregado(String nome, String sobrenome, byte idade, float salario, Status status) {
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
	
}