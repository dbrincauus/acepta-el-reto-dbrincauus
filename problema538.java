package adabyron;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class problema538 {
	public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
		    do {
		    	Integer s = Integer.parseInt(entrada.next());
		    	Integer n = Integer.parseInt(entrada.next());
		    	
		    	if (s == 0 && n == 0){
		    		break;
		    	}
		    	
		    	if (s >= n) {
		    		System.out.println("CUERDO");
		    	} else {
		    		System.out.println("SENIL");
		    	}
		    } while (true);
 	}
}