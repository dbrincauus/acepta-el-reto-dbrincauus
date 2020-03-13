package adabyron;

import java.util.Scanner;

public class problema181 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			Integer n = Integer.parseInt(sc.nextLine());
			if (n == 0)
				break;
			Integer[][] tablero = new Integer[n + 1][n + 1];
			for (int i = 0; i <= n; i++) {
				tablero[n][i] = 0;
				tablero[i][0] = 0;
			}
			tablero[n - 1][1] = 1;

			for (int i = 0; i < n; i++) {
				String linea = sc.nextLine();
				for (int j = 1; j <= n; j++) {
					if (linea.charAt(j - 1) == 'X')
						tablero[i][j] = 0;
				}
			}
			for (int i = n - 1; i >= 0; i--) {
				for (int j = 1; j <= n; j++) {
					if (tablero[i][j] == null) {
						tablero[i][j] = tablero[i + 1][j] + tablero[i][j - 1];
					}
				}
			}
			System.out.println(tablero[0][n]);
		} while (true);
	}

}