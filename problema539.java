package adabyron;

import java.util.Scanner;

public class problema539 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
	    	do {
	    		if (entrada.hasNext() != true) {
		    		break;
		    	}
	    		
	    	Integer n = Integer.parseInt(entrada.next());
	    	Integer h = Integer.parseInt(entrada.next());
	    	
	    	if (n%10 == (h+1)%10) {
 	    		System.out.println("FELIZ DECADA NUEVA");
	    	} else {
	    		System.out.println("TOCA ESPERAR");
	    	}

	    }	while (true);
	    	
	}

}