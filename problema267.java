package aceptaelreto;

import java.util.Scanner;

public class problema267 {

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in); 
		
		while(true) {
			Integer a = sc.nextInt();
			Integer b = sc.nextInt();
			Integer c = sc.nextInt();
			
			if(a==0 && b==0 && c==0) break;
			
			Integer res = 4;
			
			if (a > c) {
				res = res + (2 * (a / c));
	            if(a % c == 0)
	                res = res - 2;
			}
			
			if(b > c) {
	            res = res + (2 * (b / c));
	            if(b % c == 0)
	                res = res - 2;
	        }
			
			System.out.println(res);
			
		} sc.close();
		
	}
}
