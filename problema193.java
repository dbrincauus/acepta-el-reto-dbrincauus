package adabyron;

import java.util.Scanner;

public class problema193 {
	
	public static Integer ordenAscendente(Integer n) {
		String numero = n.toString();
		String reverse = "";
		for (int i = numero.length() - 1; i >= 0; i--) {
			reverse += numero.charAt(i);
		}
		Integer res = Integer.parseInt(reverse);
		return res;
	}
	
	public static String todoImpar(Integer n) {
		String numero = n.toString();
		Boolean impar = true;
		String res = "";
		for (int i = 0; i < numero.length(); i++) {
			if(Character.getNumericValue(numero.charAt(i))%2 != 0) {
				impar = true;
			} else {
				impar = false;
				break;
			}
		}
		if (impar == true) res = "SI";
		else res = "NO";
		
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			Integer in = sc.nextInt();
			
			Integer out = ordenAscendente(in);

			if(in == 0) break;
			else {
				if (in.toString().length() != out.toString().length()) System.out.println("NO");
				else {
					Integer res = in + out;
					System.out.println(todoImpar(res));
				}
			}
			
		} sc.close();
		
	}

}
