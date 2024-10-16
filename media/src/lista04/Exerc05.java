package lista04;

public class Exerc05 {

	public static void main(String[] args) {
		
        int[] vetorA = {1, 2, 13, 16, 13, 6, 12, 8, 8, 11};
        int[] vetorB = {1, 2, 3, 14, 15, 6, 7, 8, 9, 10};
        
        int numeroAnteriorB;
        int numeroAnteriorA;
        int tamanhoVetorC = 0;

        /*for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número para o vetor A: ");
            vetorA[i] = scanner.nextInt();

            System.out.println("Digite o " + (i + 1) + "º número para o vetor B: ");
            vetorB[i] = scanner.nextInt();
            
        }
        scanner.close();
        */
        
        for (int i = 0; i < vetorA.length -1; i++) {
			for(int j = 0; j < vetorA.length - 1 - i; j++) {
				if (vetorA[j] > vetorA[j + 1]) {
					numeroAnteriorA = vetorA[j];
					vetorA[j] = vetorA[j +1 ];
					vetorA[j + 1] = numeroAnteriorA;
				}
				
				if (vetorB[j] > vetorB[j + 1]) {
					numeroAnteriorB = vetorB[j];
					vetorB[j] = vetorB[j +1 ];
					vetorB[j + 1] = numeroAnteriorB;
				}
			}
		}
        for (int i = 0; i < vetorA.length; i++) {
        	for(int j = 0; j < vetorB.length; j++) {
        		if(vetorB[i] == vetorA[j]) {
        			tamanhoVetorC++;
        		}
        		
        	}
        	
        }
        int[] vetorC = new int [tamanhoVetorC];
        for (int i = 0; i < vetorA.length - 1; i++) {
        	
        	for(int j = 0; j < vetorC.length; j++) {
        		if(vetorB[i] == vetorA[j]) {
        			vetorC[j] = vetorB[j];
        		}
        		
        		}
        }
        
        for (int i = 0; i < vetorC.length; i++) {
            System.out.println(vetorC[i]);
        }
	}

}
