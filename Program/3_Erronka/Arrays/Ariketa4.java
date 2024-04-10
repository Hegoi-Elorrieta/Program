package Arrays;

import java.util.Scanner;

public class Ariketa4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		int[] zenbakia;
		zenbakia = new int [20];
		
		sortuZenbakia(zenbakia, teclado);
		System.out.println();
		taulaKargatu(zenbakia);
		System.out.println();
		bikoitiakBakoitiak(zenbakia);
		System.out.println();
		int suma = bikoitiakBatu(zenbakia);
		System.out.println("Esta es la suma de todos los numeros pares: " + suma);
		System.out.println();
		int multiplicacion = bakoitiakBiderkatu(zenbakia);
		System.out.println("Esta es la multiplicacion de todos los numeros impares: " + multiplicacion);
	}
	
	private static void sortuZenbakia(int[] zenbakia, Scanner teclado) {
		
		for (int i = 0; i < zenbakia.length; i ++) {
			System.out.println("Dame un numero:");
			String katea = teclado.nextLine();
			int zbk = Integer.parseInt(katea);
			zenbakia[i] = zbk;
		}
	}
	
	private static void taulaKargatu(int[] zenbakia) {
		
		String imprimir = "";
		
		for (int zenbakiak : zenbakia) {
			imprimir = imprimir + zenbakiak + ", ";
		}
		System.out.println("Estos son los numeros ingresados: " + imprimir);
	}
	
	private static void bikoitiakBakoitiak(int[] zenbakia) {
		
		for ( int i = 0; i < zenbakia.length; i ++) {
			
			if (zenbakia[i] % 2  == 0) {
				System.out.println("El numero '" + zenbakia[i] + "' es par");
			} else {
				System.out.println("El numero '" + zenbakia[i] + "' es impar");
			}
		}
	}
	
	private static int bikoitiakBatu(int[] zenbakia) {
		
		int suma = 0;
		
		for (int i = 0; i < zenbakia.length; i ++) {
			if (zenbakia[i] % 2 == 0) {
				suma = suma + zenbakia[i];				
			}
		}
		return suma;
	}
	
	private static int bakoitiakBiderkatu(int[] zenbakia) {
		
		
		int multiplicacion = 1;
		
		for (int i = 0; i < zenbakia.length; i ++) {
			if (zenbakia[i] % 2 != 0) {
				multiplicacion *= zenbakia[i];
			}
		}
		return multiplicacion;
	}

}
