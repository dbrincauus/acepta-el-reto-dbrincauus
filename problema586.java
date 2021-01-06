package aceptaelreto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class problema586 {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer cases = sc.nextInt();
		
		Integer i = 0;
		while(i < cases) {
			Integer numCalendars = sc.nextInt();
			List<Integer> lsInt = new ArrayList<>();
			for (int j = 0; j < numCalendars; j++) {
				lsInt.add(sc.nextInt());
			}
			
			Collections.sort(lsInt);
			System.out.println(lsInt.get(lsInt.size()-1)-lsInt.get(0)-numCalendars+1);
			i++;
		} sc.close();
	}
}
