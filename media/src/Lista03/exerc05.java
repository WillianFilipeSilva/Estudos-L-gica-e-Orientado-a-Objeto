package Lista03;

public class exerc05 {

	public static void main(String[] args) {

		double chico = 1.50;
		double ze = 1.10;
		int anos = 0;
		while(ze < chico) {
			chico += 0.02;
			ze += 0.03;
			anos += 1;
		}
		System.out.println(anos);
	}
}
