package lista04;

public class Exerc01 {

	public static void main(String[] args) {
		
		int numerosPares = 0;
		
		int [] pares = new int [100];
		
		for (int i = 0; i < pares.length; i++) {
			pares[i] = numerosPares+= 2;
			System.out.println(pares[i]);
		}
		
		

	}

}
