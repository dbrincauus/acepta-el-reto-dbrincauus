package adabyron;


import java.util.*;

public class problema245 {

	private static SortedSet<Integer> lista1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0) break;
			long aux = 0;
			long aux2 = 10^18;
			int val = 0;
			int vol = 0;
			String nombre = "DESCONOCIDOS";
			for (int i = 0; i < n; i++) {
				long tam = sc.nextLong();
				if (tam > aux) val += 1;	
				if (tam < aux2) vol += 1;
				aux = tam;
				aux2 = tam;
			}
			
			if (val == n) nombre = "DALTON";
			if (vol == n) nombre = "DALTON";
			System.out.println(nombre);
		}
	} 

}