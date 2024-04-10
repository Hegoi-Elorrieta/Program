package Arrays;

import java.util.Scanner;

public class Ariketa3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner teclado = new Scanner(System.in);
		
		int[] numero;
		numero = new int [5];
		
		darNumero(numero, teclado);
		leerNumero(numero);

	}
	
	private static void darNumero(int[] numero, Scanner teclado) {
		
		for (int i = 0; i < numero.length; i ++) {
			System.out.println("Dame un numero:");
			String katea = teclado.nextLine();
			int zbk = Integer.parseInt(katea);
			numero[i] = zbk;
		}
		
	}
	
	private static void leerNumero(int[] numero) {
		
		String imprimir = "";
		
		for (int numeros : numero) {
			imprimir = imprimir + numeros + ", ";
		}
		
		System.out.println("Estos son los numeros: " + imprimir);
		
	}

}
