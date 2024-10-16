package matriz;

public class Matrizes {

	public static void main(String[] args) {
		
		int [] [] matriz = new int [2] [3];
		matriz [0] [0] = 7;
		matriz [1] [1] = 5;
		matriz [1] [2] = 9;
		
		for ( int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++) {
				
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

	}

}
