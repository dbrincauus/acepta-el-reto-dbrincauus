package HackerRank;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HackerRank_SockMerchant {



    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
    	int pairs = 0;
    	Map<Integer, Integer> mapa = new HashMap<Integer, Integer>();
    	for (int i = 0; i < ar.length; i++) {
			if(mapa.containsKey(ar[i])) {
				Integer val = mapa.get(ar[i]) + 1;
				mapa.put(ar[i], val);
			}
			else mapa.put(ar[i], 1);
		}
    	
    	for(int i: mapa.keySet()) {
    		pairs += mapa.get(i)/2;
    	}
    	return pairs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
