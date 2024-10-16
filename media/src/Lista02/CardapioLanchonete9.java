package Lista02;

import java.util.Scanner;

public class CardapioLanchonete9 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double preco = 0;
		
		System.out.println("Seja bem vindo a Lanchonete Senac!");
		System.out.println("Para melhor le atender, pedimos que você digite o codigo do produto desejado!");
		System.out.println("        -------    CARDAPIO   -------  \n"
				+ "	Produto		Código  Preço\n"
				+ "	\n"
				+ "	Cachorro-quente	100 	1,20\n"
				+ "	\n"
				+ "	Bauru simples 	101 	1,30\n"
				+ "	\n"
				+ "	Bauru com ovo 	102 	1,50\n"
				+ "	\n"
				+ "	Hambúrguer 	103 	1,20\n"
				+ "	\n"
				+ "	Misto quente 	104 	1,30\n"
				+ "	\n"
				+ "	Refrigerante 	105 	1,00\n");
		
		System.out.println("Insira o codigo do seu produto:\n");
		byte codigo = scanner.nextByte();
		
		System.out.println("Insira a quantidade:\n");
		byte quantidade = scanner.nextByte();
		
		scanner.close();
		
		switch (codigo) {
		
        case 100,103:
        	preco = 1.20;
            break;
        case 101,104:
        	preco = 1.30;
            break;
        case 102:
        	preco = 1.50;
            break;
        case 105:
        	preco = 1.00;
        	break;
        default:
            System.out.println("Digite um codigo valido!");
            break;
		}
		if (codigo >=100 && codigo <= 105) {
			System.out.printf("Sua comanda deu: %.2f" , (float)(preco * quantidade) + " R$.");
		}else {
			System.out.println("Digite um codigo valido");
		}
	}
}
