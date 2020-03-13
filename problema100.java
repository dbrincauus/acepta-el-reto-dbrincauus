package adabyron;

import java.util.Scanner;

public class problema100 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in); 

		int casos, num, iteraciones, kapkrekar, x, y;
		

		casos = s.nextInt();

		for(int i=0; i<casos; i++) {

			iteraciones = 1;

			num = s.nextInt();

			if(num == 6174) iteraciones = 0;

			else if(num == 0) iteraciones = 8;

			else {

				while(num < 1000) num *= 10;
				

				x = ordenDescendente(num);
				y = ordenAscendente(num);

				kapkrekar = x - y;

				if(kapkrekar == 0) iteraciones = 8;

				else {

					while (kapkrekar != 6174 && iteraciones < 8) {

						iteraciones++;

						x = ordenDescendente(kapkrekar);

						while(x < 1000) x *= 10;
						

						y = ordenAscendente(kapkrekar);

						kapkrekar = x - y;

					}

				}

			}

			System.out.println(iteraciones);

		}

		s.close();

	}


	public static int ordenAscendente(int num) {

		int digito = 0;
		int aux = 0;
		int ordenado = 0;


		for(int i=0; i<=9; i++) {

			aux = num;

			while(aux > 0) {

				digito = aux % 10;

				if(digito == i) ordenado = (ordenado * 10) + digito;
				
				aux /= 10;

			}


		}

		return ordenado;

	}


	public static int ordenDescendente(int num) {

		int digito = 0;
		int aux = 0;
		int ordenado = 0;

		for(int i=9; i>=0; i--) {

			aux = num;

			while(aux > 0) {

				digito = aux % 10;

				if(digito == i) ordenado = (ordenado * 10) + digito;
				
				aux /= 10;

			}


		}

		return ordenado;

	}



}