
public class Primo {

	public static void main(String[] args) {
		
		System.out.println(verificarPrimo(1));

	}
	
	public static boolean verificarPrimo(int valor) {
		
		if(valor ==1)
			return false;
		
		
		for(int i = 2; i < valor; i++) {
			
			if(valor % i == 0) 
				return false;
		}
		
		return true;

	}

}
