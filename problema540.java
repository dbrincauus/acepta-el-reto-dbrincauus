package adabyron;

import java.util.Scanner;

public class problema540 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	    
	    	int j = entrada.nextInt();
	    	for (int i = 0; i < j; i++) {
		    	int piso = Integer.parseInt(entrada.next());
		    	int esca = Integer.parseInt(entrada.next());
		    	int pisco = Integer.parseInt(entrada.next());
		    	int escad = Integer.parseInt(entrada.next());
		    	int bajar = (pisco * esca) + escad;
		    	int subir = bajar + (piso * esca);
		    	System.out.println(bajar+" "+subir);
			}

	}
}