
public class GiveBad {

	public static void main(String[] args) {
		
		

	}
	
	public static int fatorial(int valor) {
		
		if (valor == 0 || valor == 1)
			return 1;
		
		return valor * fatorial(valor - 1);
	}
	
	public static boolean verificarFatorial(int valor, int valorFatorial) {
		
		return fatorial(valor) == valorFatorial;
	}
	
	public static float calcularEuler(int valor) {
		
	//Euler = 1 + 1 / 1! + 1 / 2! + 1 / 3! + ... + 1 / N!
		float e = 1;
		
		for(int i = 1; i <= valor; i++) {
			e += 1f / fatorial(i);
		}
		return e;
	}
	
	public static long recursivoFibbonacci (int valor) {
		
		if (valor == 1)
			return 0;
		
		if (valor == 0)
			return 1;
		
		return recursivoFibbonacci(valor - 1) + recursivoFibbonacci(valor -2);
	}

	public static long MemorizadoFibbonacci (int valor, long [] memoria) {
		
		if (valor == 1)
			return 0;
		
		if (valor ==0 )
			return 1;
		
		if(memoria[valor-1] != 0)
			return memoria[valor -1];
		
		memoria[valor - 1] = MemorizadoFibbonacci(valor - 1, memoria) + MemorizadoFibbonacci(valor - 2, memoria);
		
		return memoria[valor - 1];
	}
}
