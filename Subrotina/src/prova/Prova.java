package prova;
public class Prova {

	public static void main(String[] args) {
	
		System.out.println(eComposto(1));
		//System.out.println(ehPrimo(3));
		//System.out.println(nPrimo(25));
		//System.out.println(proximoPrimo(7)); 2, 3, 5, 7, 11
		//System.out.println(primosGemeos(37, 41));
	}
	
	public static boolean eComposto (int valor) {
		int divisores = 0;
		for (int i = 2; i <= valor; i ++) {
			if (valor % i == 0) {
				divisores++;
			}
		}
		if (divisores > 2) {
			return true;
		}
		return false;
	}
	
	public static boolean ehComposto (int valor) {
		int divisores = 0;
		for (int i = 1; i <= valor; i ++) {
			if (valor % i == 0) {
				divisores++;
			}
		}
		if (divisores > 2) {
			return true;
		}
		return false;
	}
	
 	public static boolean ehPrimo (int valor) {
		if (valor <= 1) {
			return false;
		}
		if (!ehComposto(valor))
			return true;
		
		return false;
	}
	
	public static int nPrimo (int n) {
		int numero = 1;
		int quantidadePrimos = 0;
		
		while (quantidadePrimos != n) {
			numero++;
			
			if (ehPrimo(numero)) {
				quantidadePrimos++;
			}
		}
		return numero;
	}
	
	public static int proximoPrimo (int valor) {
		int numero = valor + 1;
		
		while (!ehPrimo(numero)) {
			numero++;
		}
		return numero;
	}
	
	public static boolean primosGemeos (int valor, int valor1) {
		if (ehPrimo(valor) && ehPrimo(valor1)) {
			
			if (valor < valor1) {
				if (valor + 2 == valor1) {
					return true;
				}
			}
			if (valor1 + 2 == valor) {
				return true;
			}
		}
		return false;
	}
}