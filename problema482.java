import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
		     String line = sc.nextLine();
		     if (line.charAt(0)=='.') break;
		     
		     Integer negros = 0;
		     Integer grises = 0;
		     
		     for (int i = 0; i < line.length(); i++) {
		         if(line.charAt(i)=='N') negros+=1;
		        else if(line.charAt(i)=='G') grises+=1;
		     }	
		     //System.out.println("N: " + negros + " G: " + grises);
		     if(negros%2!=0 && grises%2!=0) System.out.println("PAREJA MIXTA");
		     else if(negros%2==0 && grises%2==0) System.out.println("EMPAREJADOS");
		     else if((negros==0 || negros%2!=0) && grises%2==0) System.out.println("NEGRO SOLITARIO");
		     else if(negros%2==0 && (grises%2!=0 || grises==0)) System.out.println("GRIS SOLITARIO");
		} sc.close();
	}
}