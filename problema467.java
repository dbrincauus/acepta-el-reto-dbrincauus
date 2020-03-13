package adabyron;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class problema467 {
	public static void main(String[] args) throws IOException {
		 BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		    PrintWriter salida = new PrintWriter(System.out);
		    int casos;
		    String linea, p1, p2;


		    casos = Integer.parseInt(entrada.readLine());

		    for (int i = 0; i < casos; i++) {
		      linea = entrada.readLine();

		      StringTokenizer st = new StringTokenizer(linea, " ");
		      p1 = st.nextToken();
		      st.nextToken();
		      p2 = st.nextToken();

		      salida.append((p1.equalsIgnoreCase(p2)) ? "TAUTOLOGIA\n" : "NO TAUTOLOGIA\n");
		    }

		    salida.flush();
		    salida.close();
		
	}
}