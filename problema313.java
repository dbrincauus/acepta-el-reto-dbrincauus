package adabyron;

public class problema313 {
    static java.util.Scanner sc;
    
    private static final String SI = "SI";
    private static final String NO = "NO";
    public static void main (String args[]) 
    {
        sc = new java.util.Scanner(System.in);
        int casos = sc.nextInt();

        for (int i = 1; i <= casos; i++) {
            llega();
        }
    }

    private static void llega()
    {
        int s = sc.nextInt(); 
        int c = sc.nextInt(); 
        
        if((s + c) >= 0) {
            System.out.println(SI);
        }
        else {
            System.out.println(NO);
        }
    }
}