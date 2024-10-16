
public class exemplo1 {

	public static void main(String[] args) {
		
		int resultado = testarFatorial(5);
		System.out.println(resultado);
	}

public static int exponenciação(int base, int expoente) {
		
	int resultado = 1;
	for(int i = 0; i < expoente; i++) {
		 resultado *= base; 
	}
	return resultado;
}

public static int testarFatorial(int valor) {
	
	int resultado = 1;   
	
	for (int i = valor; i > 1; i--) {
		resultado *= i;
	}
	return resultado;
}



}