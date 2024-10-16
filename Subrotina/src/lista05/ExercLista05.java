package lista05;

public class ExercLista05 {

	public static void main(String[] args) {
		
		int[] valores = {1, 3, 2, 5, 1};
		//int[][] valoresA = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
		
		System.out.println(calcularMaiorValorVetor(valores));
		
	}

	public static double calcularArea(double base, double altura) {
		//Exerc01
		
		double area = base * altura;
		return area;
	}

	public static double calcularMedia(double nota1, double nota2, double nota3) {
		//Exerc02
		
		double media = (nota1 + nota2 + nota3) / 3;

		return media;
	}

	public static String calcularIdade(int idade) {
		//Exerc03
		
		int dias;
		int anos = 0;
		int meses;
		if (idade >= 365) {
			anos = idade / 365;
			dias = idade % 365;
			meses = dias / 30;
			dias = dias % 30;
		} else {
			dias = idade % 365;
			meses = dias / 30;
			dias = dias % 30;
		}

		return ("Tem " + anos + " anos " + meses + " meses e " + dias + " dias");
	}
	
	public static double calcularCustoConsumidor(double precoDoCarro) {
		//Exerc04
		
		double custoConsumidor = precoDoCarro + (precoDoCarro * 0.28) + (precoDoCarro * 0.45);
		return custoConsumidor;
	}
	
	public static double calcularSalario(int qtdCarrosVendidos, double valorTotalVendido, double salarioFixo, double comissãoCarro) {
		//Exerc05
		
		double salario = (qtdCarrosVendidos * comissãoCarro) + valorTotalVendido + (valorTotalVendido * 0.05) + salarioFixo; 
		return salario;
	}
	
	public static int fatorial(int valor) {
		
		if (valor == 0 || valor == 1)
			return 1;
		
		return valor * fatorial(valor - 1);
	}
	
	public static boolean verificarFatorial(int valor, int valorFatorial) {
		//Exerc06
		
		return fatorial(valor) == valorFatorial;
	}
	
	public static float calcularEuler(int valor) {
		//Exerc07
		
		//E = 1 + 1 / 1! + 1 / 2! + 1 / 3! + ... + 1 / N!
		float e = 1;
		
		for(int i = 1; i <= valor; i++) {
			e += 1f / fatorial(i);
		}
		return e;
	}
	
	public static int calcularProxPerfeito(int numero) {
		//Exerc08
		
		int numeroAtual = numero;
		int somaDivisores = 0;
		
		while(true) {
			numeroAtual++;
			somaDivisores = 0;
			
			for(int i = 1; i < numeroAtual; i++) {
				
				if(numeroAtual % i == 0) {
					somaDivisores += i;
				}
			}
			
			if(somaDivisores == numeroAtual) {
				break;
			}
		}
		return numeroAtual;
	}
	
	public static int[] calcularProgressaoAritmetica(int n, int a1 ,int r) {
		//Exerc09
		
		int[] progressao = new int [n];
		
		progressao[0] = a1;
		
		for(int i = 1; i < n; i++) {
			progressao[i] = progressao[i-1] + r;
		}
		
		return progressao;
	}
	
	public static int[] FatorialVetor(int[] vetorA) {
		//Exerc10
		
		int[] vetor = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) 
			vetor[i] = fatorial(vetorA[i]); 
		
		return vetor;//System.out.println(Arrays.toString(FatorialVetor(vetorA)));
	}
	
	public static int calcularMaiorValorVetor(int[] vetor) {
		//Exerc11
		
		int n = vetor.length;
		
		for (int i = 0; i < n-1; i++) {
	        for (int j = 0; j < n-i-1; j++) {
	            if (vetor[j] > vetor[j+1]) {
	            	// troca vetor[j+1] e vetor[i]
		            int temp = vetor[j];
		            vetor[j] = vetor[j+1];
		            vetor[j+1] = temp;
	            }
	        }
		}
		return vetor[vetor.length -1];

		
}
	
	public static int somarElementoMatriz(int[][] matriz) {
		//Exerc12
		
		int soma = 0;
		for(int i = 0; i< matriz.length; i++) {
			
			for(int j = 0; j < matriz[0].length; j++) {
				
				soma+= matriz[i][j];
			}
		}
		
		return soma;
	}
	
	
	
}
