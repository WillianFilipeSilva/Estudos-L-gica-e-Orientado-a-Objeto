package Lista03;

public class numerosImpares01 {

	public static void main(String[] args) {
		
		
		for(int i = 1; i <100;i++) {
			if(i % 2 == 0) {
				i++;
				System.out.println(i);
			}
			else {
				System.out.println(i);
			}
		}
	}
}

