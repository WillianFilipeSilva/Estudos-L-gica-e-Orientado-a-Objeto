package Lista03;

public class mostrarQuantidadePrimos {

	public static void main(String[] args) {
	
	    int[] primos = new int[10];
	    int quantidadePrimos = 0;
	    int numero = 2;
	    
	    while (quantidadePrimos < 10) {
	        boolean ehPrimo = true;

	        for (int i = 2; i <= numero; i++) {
	        	
	            if (numero % i == 0) {
	                ehPrimo = false;
	                break;
	            }
	        }
	        if (ehPrimo) {
	            primos[quantidadePrimos] = numero;
	            quantidadePrimos++;
	            }
	        
	        numero++;
	        }

	        for (int primo : primos) {
	            System.out.print(primo);
	        }    
	                   
	}
}