import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		Integer i = 0;
		Integer fin = Integer.parseInt(sc.nextLine());
		while(i<fin) {
			String line = sc.nextLine();
			String[] linea =	line.split(" ");
			Integer x = Integer.parseInt(linea[0]);
			Integer y = Integer.parseInt(linea[1]);
			
			Integer value = (x*y)/2;
			Integer res = (x*y)-value;
			
			if(res >= value) System.out.println(res + " " + value);
			else System.out.println(value + " " + res);
			i++;
		} sc.close();
	}
}
