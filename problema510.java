package adabyron;

import java.util.*;

public class problema510 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int numZap = sc.nextInt();
			
			if (numZap == 0) break;
			
			List<Integer> listaP = new ArrayList<>();
			List<Integer> listaN = new ArrayList<>();
			List<Integer> lista = new ArrayList<>();
			List<Integer> listaOri = new ArrayList<>();
			for (int i = 0; i < numZap; i++) {
				listaOri.add(sc.nextInt());
			}
			for (Integer i : listaOri) {
				if (i >= 0) {
					listaP.add(i);
					lista.add(1);
				}
				else {
					listaN.add(i);
					lista.add(0);
				}
			}
			
			Collections.sort(listaP);			
			Comparator<Integer> comparador = Collections.reverseOrder();
			Collections.sort(listaN, comparador);
			
			for (int h = 0; h < lista.size(); h++) {
				listaP.add(0);
				listaN.add(0);
			}
			
			for (int i = 0; i < numZap; i++) {
				if (lista.get(i) == 1) {
					lista.set(i, listaP.get(0));
					listaP.remove(0);
				}
				if (lista.get(i) == 0) {
					lista.set(i, listaN.get(0));
					listaN.remove(0);
				}
			}
			System.out.println(lista);
		}
	}
}