
public class Professor extends Empregado {
	
	public Professor(String nome, String sobrenome, byte idade, float salario) {
		super(nome, sobrenome, idade, salario);
	}

	public float calcularSalario() {
		return getSalario() * 1.1f;
	}
	
	public void fazerChamada() {
		System.out.println("Iniciando a chamada!\n");
	}
	
}