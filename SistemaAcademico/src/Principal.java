
public class Principal {

	public static void main(String[] args) {
		
		Empregado[] empregados = new Empregado[3];
		
		empregados[0] = new Professor("Carlos", "Pereira", (byte)38, 2500f);
		empregados[1] = new Diretor("Maria", "Souza", (byte)48, 7500f);
		empregados[2] = new Professor("Carla", "Silva", (byte)28, 2500f);
		
		for (Empregado empregado : empregados)
			System.out.println(empregado.calcularSalario());
		
		/*
		System.out.println(empregados[2].getStatus());
		
		Diretor diretor = (Diretor) empregados[1];
		diretor.demitirEmpregado(empregados[2]);
		
		System.out.println(empregados[2].getStatus());
		
		Pessoa professor = new Professor("Roberto", "Heinzle", (byte)64, 1000);
		
		Pessoa aluno01 = new Aluno("Lucas", "Silva", (byte)14);
		Pessoa aluno02 = new Aluno("Luana", "Sante", (byte)15);
		Pessoa aluno03 = new Aluno("Luiza", "Souza", (byte)16);
		
		System.out.println("Listagem da Turma:");
		
		System.out.println("Nome do aluno: " + aluno01.getNome() + 
				"\nSobrenome do aluno: " + aluno01.getSobrenome() + 
				"\nIdade do aluno: " + aluno01.getIdade());
		
		System.out.println("\nNome do aluno: " + aluno02.getNome() +
				"\nSobrenome do aluno: " + aluno02.getSobrenome() + 
				"\nIdade do aluno: " + aluno02.getIdade());
		
		System.out.println("\nNome do aluno: " + aluno03.getNome() + 
				"\nSobrenome do aluno: " + aluno03.getSobrenome() +
				"\nIdade do aluno: " + aluno03.getIdade());
		
		System.out.println("\nChamada da Turma:\n");
		
		((Professor) professor).fazerChamada();
		
		((Aluno)aluno01).responderChamada();
		((Aluno)aluno02).responderChamada();
		((Aluno)aluno03).responderChamada();
		*/
	}
}