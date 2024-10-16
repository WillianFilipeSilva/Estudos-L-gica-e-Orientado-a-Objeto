package Lista03;

public class exerc10 {

	public static void main(String[] args) {
		
		byte quantidadePerfeitosEncontrada = 0;
		int numeroAtual = 1;
		int somaDivisores = 0;
		
		while(quantidadePerfeitosEncontrada != 5) {
			
			somaDivisores = 0;
			
			for(int i = 1; i <= numeroAtual; i++) {
				
				if(numeroAtual % i == 0) {
					somaDivisores += i;
				}
				
			}
			if(somaDivisores == (numeroAtual * 2)) {
				System.out.println(numeroAtual);
				quantidadePerfeitosEncontrada++;
			}
			
			numeroAtual++;
		}
	}

}
