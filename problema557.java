package adabyron;

import java.util.Scanner;

public class ProblemaD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Long casos = sc.nextLong();
		Long i = 0L;
		while(i<casos) {
			Long LargosTotales = sc.nextLong();
			Long TiempoPorLargo = sc.nextLong();
			Long LargosPorSerie = sc.nextLong();
			Long DescansoEntreSeries = sc.nextLong();
			Long SegundosExtras = sc.nextLong();
			
			Long NumeroDeSeries = LargosTotales/LargosPorSerie;
			
			if(NumeroDeSeries*LargosPorSerie<LargosTotales) {
				NumeroDeSeries += 1;
			} else if (NumeroDeSeries*LargosPorSerie>LargosTotales){
				NumeroDeSeries -= 1;
			}
			
			Long TiempoDeDescanso = DescansoEntreSeries * (NumeroDeSeries - 1);
			
			Long SegExt = (NumeroDeSeries - 2) * SegundosExtras;
			Long Cuadrado = (SegExt * (NumeroDeSeries - 3)) / 2;
			
			Long TiempoDeLargos = LargosTotales * TiempoPorLargo;
			
			Long TiempoTotal = TiempoDeDescanso + TiempoDeLargos + Cuadrado + SegExt;
			System.out.println(TiempoTotal);
			i++;
		} sc.close();

	}

}
