package adabyron;

import java.util.Scanner;

public class problema337 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Integer numCasos = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < numCasos; i++) {
			String[] lineaArriba = sc.nextLine().split(" ");
			String[] lineaAbajo = sc.nextLine().split(" ");
			Boolean si = true;
			Integer tama = 0;
			for (int j = 0; j < lineaAbajo.length; j++) {
				if(j==0) tama = Integer.parseInt(lineaArriba[j]) + Integer.parseInt(lineaAbajo[j]);
				else {
					if(Integer.parseInt(lineaArriba[j]) + Integer.parseInt(lineaAbajo[j]) != tama) {
						System.out.println("NO");
						si = false;
						break;
					}
					
				}
			}
			if(si) System.out.println("SI");
		}
	}

}
