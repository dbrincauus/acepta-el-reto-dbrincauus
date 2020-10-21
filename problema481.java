import java.util.Scanner;

public class Problema481 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] letras = {"h", "g", "f", "e", "d", "c", "b", "a"};
		while(true) {
			Integer letra = sc.nextInt();
			Integer numero = sc.nextInt();
			if(letra == 0 && numero == 0) {
				break;
			}
			else {
				String newLetra =  letras[letra-1];
				System.out.println(newLetra + numero);
			}
		}sc.close();
	}

}
