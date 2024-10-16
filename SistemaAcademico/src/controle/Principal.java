package controle;

import java.util.ArrayList;
import java.util.List;

import modelo.entidade.pessoa.empregado.Empregado;
import modelo.entidade.pessoa.empregado.professor.Professor;
import modelo.excecao.pessoa.IdadeInvalidoException;
import modelo.excecao.pessoa.NomeInvalidoException;
import modelo.excecao.pessoa.SobrenomeInvalidoException;

public class Principal {

	public static void main(String[] args) {
		
		List<Empregado> empregados = new ArrayList<>();
		
		try {
			Empregado empregado01 = new Professor("Carlos", "Pereira", (byte)38, 2500f);
			Empregado empregado02 = new Professor("Carlos", "Pereira", (byte)38, 2500f);
			
			empregados.add(empregado01);
			empregados.remove(empregado02);
			
			System.out.println(empregados.contains(empregado01));
//			empregados.add(new Professor("Carlos", "Pereira", (byte)38, 2500f));
//			empregados.add(new Diretor("Maria", "Souza", (byte)48, 7500f));
//			empregados.add(new Professor("Carla", "Silva", (byte)28, 2500f));
		
		for (Empregado empregado : empregados)
			System.out.println(empregado.calcularSalario());
		
		}
		
		catch(NomeInvalidoException excecao) {
			System.out.println(excecao.getMessage());
		}

		catch (SobrenomeInvalidoException excecao) {
			System.out.println(excecao.getMessage());
		}
		
		catch (IdadeInvalidoException excecao) {
			System.out.println(excecao.getMessage());
		}
		
		finally {
			System.out.println("entrou!");
		}
	}
}