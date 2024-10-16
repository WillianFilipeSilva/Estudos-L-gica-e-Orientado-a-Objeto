package media;

import java.util.Scanner;

public class Moedas {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("quantas moedas há na arca ?");
		int moedas = scanner.nextInt();
		System.out.println("quantos marinheiros estao abordo? ");
        int marinheiros = scanner.nextInt();

        int moedasMarin = moedas / (marinheiros + 2);
        int moedasCapitao =  2 * moedasMarin;

        System.out.println(moedasCapitao);
		
        scanner.close();
        
	}

}
