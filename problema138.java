package adabyron;

import java.util.Scanner;

public class problema138 {
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in); 
		
		while(s.hasNext()) {
			
		Integer casos = s.nextInt();
		
			for (int i = 0; i < casos; i++) {
				
				Integer res = 0;
				
				Integer valor = s.nextInt();
				
				Integer lsdos = 0;
				Integer lscinco = 0;
				
				Integer div2 = 0;
				Integer div5 = 0;
				if (valor != 0)  {
					int j = 1;
					while (j <= valor) {
						if (j%2==0 && j != 0) {
							div2 = j;
						}
						if (j%5==0 && j != 0) {
							div5 = j;
						}
						while(div2%2 == 0 && div2 != 0) {
							lsdos += 1;
							div2 /= 2;
						}
						while(div5%5 == 0 && div5 != 0) {
							lscinco += 1;
							div5 /= 5;
						}
						j++;
					}
					if(lsdos >= lscinco) res = lscinco;
					else res = lsdos;
				}

				System.out.println(res);
			}
			
		} s.close();
	} 

}
