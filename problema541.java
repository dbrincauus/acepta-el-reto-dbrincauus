package adabyron;


import java.util.Scanner;

public class problema541 {

	static int gcd(int a, int b) 
    { 
        if (a == 0) 
            return b; 
        return gcd(b % a, a); 
    } 

 
    static int findGCD(int arr[], int n) 
    { 
        int result = arr[0]; 
        for (int i = 1; i < n; i++){ 
            result = gcd(arr[i], result); 
  
            if(result == 1) 
            { 
               return 1; 
            } 
        } 
  
        return result; 
    } 
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	    do {
		    int x = Integer.parseInt(entrada.next());
		    int y = Integer.parseInt(entrada.next());
		    int z = Integer.parseInt(entrada.next());

	    	int[] array = {x,y,z};
	    	
	    	int mcdN = findGCD(array,3);
		    if (x == 0 && y == 0 && z == 0) {
		    	break;
		    }
		    int n = (x + y + z)/mcdN;
		    System.out.println(n);
		    
			
	    } while (true);
	}
}