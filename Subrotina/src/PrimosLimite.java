
public class PrimosLimite {

public static void main(String[] args) {
		int limite = 10;
		for(int i = 0; i < limite; i++) {
			
			System.out.println((limite));
		}
	}
	
public static boolean ehPrimo(int valor) {
 
	if (valor == 1)
		return false;
 
		for (int i = 2; i < valor; i++) {
 
			if (valor % i == 0)
			return false;
		}
 
		return true;
}
 
public static int contarPrimosLimite(int limite) {
 
	int quantidadePrimos = 0;
 
	for (int i = 2; i <= limite; i++) {
 
		if (ehPrimo(i))
			quantidadePrimos++;
	}
 
	return quantidadePrimos;
 
}
 
public static long[] retornarPrimosLimite(int limite) {
 
	int quantidadePrimos = 0;
	long[] primos = new long[contarPrimosLimite(limite)];
 
	for (int i = 2; i <= limite; i++) {
 
		if (ehPrimo(i)) {
			primos[quantidadePrimos] = i;
			quantidadePrimos++;
		}
	}
 
	return primos;
 
}
 
}
