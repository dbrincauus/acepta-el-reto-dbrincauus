import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc =	new Scanner(System.in);	
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			String res = "";
			for (int i = 0; i < line.length(); i++) {
				if (i != line.length()-1) res += line.charAt(i) + "0";
				else res += line.charAt(i);
			}
			System.out.println(res);
		} sc.close();
	}
}