
public class Diretor extends Empregado implements RH {
	
	public Diretor (String nome, String sobrenome, byte idade, float salario) {
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