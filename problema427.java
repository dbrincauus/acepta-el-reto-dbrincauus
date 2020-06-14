import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer val = Integer.parseInt(sc.nextLine());
		Integer i = 0;
		while(i<val){
			String nombre = sc.nextLine();
			String creador = sc.nextLine();
			if(nombre.equals("Luke") && creador.equals("padre")) System.out.println("TOP SECRET");
			else System.out.println(nombre + ", yo soy tu " + creador);
			i++;
		} sc.close();
	}
}