
public class Fibonacci {

	public static void main(String[] args) {
		
	System.out.println(pertenceFibonacci(5));
	
	}
	
	public static boolean pertenceFibonacci(int valor) {
		
		int primeiroValor = 0;
		int segundoValor = 1;
		int proximoValor = 0;
		
		while(segundoValor <= valor) {
			
			proximoValor = segundoValor + primeiroValor;
			primeiroValor = segundoValor;
			segundoValor = proximoValor;
		}
		
		return primeiroValor == valor;
		
	}
	
}
