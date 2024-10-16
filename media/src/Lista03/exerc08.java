package Lista03;

public class exerc08 {

	public static void main(String[] args) {
		

		int produto = 1;
		
	    for (int i = 92; i <= 107; i++) {
	    	
	    	for(int j = 2; j < i; j++) {
	    		
	    		if (i % j == 0) {
		    		produto *= i;
		    		break;
		    	}
	    		
	    	}
	    
	    }
	    
	    System.out.println(produto);	
	}

}
