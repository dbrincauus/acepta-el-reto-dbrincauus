import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer val = Integer.parseInt(sc.nextLine());
		Integer i = 0;
		while(i<val){
			String[] line = sc.nextLine().split(" ");
			Integer m = Integer.parseInt(line[0]);
			Integer c = Integer.parseInt(line[1]);
			
			if((c*45*90) <= m && m <= (c*120*90)) System.out.println("SI");
			else System.out.println("NO");
			i++;
		}
	}
}