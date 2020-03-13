package adabyron;

import java.util.*;

public class problema335 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			long n = sc.nextLong();
			if (n == 0) sc.close();
			for (long i = 0; i < n; i++) {
				long h = sc.nextLong();
				long aux = h*(h+1)*(h+2);
				System.out.println(aux/6);
			}
		}

}