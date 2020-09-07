package aceptaelreto;

import java.util.Scanner;

public class problema256 {
	
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in); 
		
		while(true) {
			String line = sc.nextLine();
			
			if (line.equals("0")) {
				break;
			}
			
			String linea = line;
			Integer fin = 0;
			while(linea.length() > 0) {
				fin += Integer.parseInt(linea);
				linea = linea.substring(1);
			}
			
			System.out.println(fin);
		} sc.close();
	}
}
