package Lista02;

import java.util.Scanner;

public class HoraJogo4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Vamos calcular a duração da ártida! ");
		
		System.out.println("Qual o horario do inicio da partida ");
		byte horaInicio = scanner.nextByte();
		
		System.out.println("Qual o horario do fim da partida ? ");
		byte horaFim = scanner.nextByte();
		scanner.close();
		
		byte tempoPartida = (byte)(horaFim - horaInicio);
		
		if (tempoPartida <= 0) {
			tempoPartida = (byte)(tempoPartida + 24);
			System.out.println("A duração da partida é de " + tempoPartida + (tempoPartida == 1 ? " hora": " horas"));
		}
		else {
			System.out.println("A partida nao pode durar mais de 24 horas! ");
		}

	}

}
