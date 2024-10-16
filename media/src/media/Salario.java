package media;

public class Salario {

	public static void main(String[] args) {
		
		float salario = 1500;
		float aumento = 0;
		
		if (salario <= 1500)
			aumento = 0.25f;
		
		else
			aumento = 0.05f;
		
		aumento = salario <= 1500 ? 0.25f : 0.05f;
		
		
		System.out.println("O novo salário é de: " + (salario * aumento +  salario));

	}

}
