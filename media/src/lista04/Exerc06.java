package lista04;

public class Exerc06 {

	public static void main(String[] args) {
		
		int [] pares = new int [15];
		int numero = 0;
		int quantidadepares = 0;
		
		for (int i = 0; i < pares.length; i++) {
			pares[i] = numero += 1;
			
			if(pares[i] % 2 == 0) {
			quantidadepares++;
			}
		}
		System.out.println("São: " + quantidadepares + " numeros pares");
	}

}
