package adabyron;

import java.util.Scanner;

public class problema439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

			Integer casos = Integer.parseInt(sc.nextLine());
			for (int i = 0; i < casos; i++) {
				String line = sc.nextLine();
				String[] arr = line.split(" ");
				Integer D, V, T;
				if(arr[0].contains("D") && arr[1].contains("V")) {
					D = Integer.parseInt(arr[0].split("=")[1]);
					V = Integer.parseInt(arr[1].split("=")[1]);
					if (V==0) T=0;
					else T = D/V;
					System.out.println("T=" + T.toString());
				} else if(arr[0].contains("V") && arr[1].contains("D")) {
					D = Integer.parseInt(arr[1].split("=")[1]);
					V = Integer.parseInt(arr[0].split("=")[1]);
					if (V==0) T=0;
					else T = D/V;
					System.out.println("T=" + T.toString());
				} else if(arr[0].contains("T") && arr[1].contains("D")) {
					T = Integer.parseInt(arr[0].split("=")[1]);
					D = Integer.parseInt(arr[1].split("=")[1]);
					if (T==0) V=0;
					else V = D/T;					
					System.out.println("V=" + V.toString());
				} else if(arr[0].contains("D") && arr[1].contains("T")) {
					T = Integer.parseInt(arr[1].split("=")[1]);
					D = Integer.parseInt(arr[0].split("=")[1]);
					if (T==0) V=0;
					else V = D/T;	
					System.out.println("V=" + V.toString());
				} else if(arr[0].contains("V") && arr[1].contains("T")) {
					T = Integer.parseInt(arr[1].split("=")[1]);
					V = Integer.parseInt(arr[0].split("=")[1]);
					D = V*T;
					System.out.println("D=" + D.toString());
				} else if(arr[0].contains("T") && arr[1].contains("V")) {
					T = Integer.parseInt(arr[0].split("=")[1]);
					V = Integer.parseInt(arr[1].split("=")[1]);
					D = V*T;
					System.out.println("D=" + D.toString());
				} 
			}
		 sc.close();
	}

}
