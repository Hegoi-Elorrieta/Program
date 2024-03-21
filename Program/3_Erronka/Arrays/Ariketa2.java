package Arrays;

import java.util.Scanner;

public class Ariketa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numero = new int[5];
		
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < 5; i ++) {
			System.out.println("Mete " + (i + 1) + " un numero:");
			numero[i] = datuakImprimatu(teclado);
		}
		
		bikoitiakBakoitiak(numero);
		
	}
	
	public static int datuakImprimatu(Scanner teclado) {
		int numeros;
		
		do {
			System.out.println("Numero: ");
			while (!teclado.hasNext()) {
				System.out.println("El numero tiene que ser un numero positivo.");
				System.out.println("Numero: ");
				teclado.next();
			}
			
			numeros = teclado.nextInt();
			
			if (numeros < 0) {
				System.out.println("El numero tiene que ser mayor que '0'");
			}
		}while (numeros < 0);
		return numeros;
	}
	
	public static void bikoitiakBakoitiak (int[] numero) {
		
		for (int i = 0; i < numero.length; i ++) {
			if (numero[i] % 2 == 0) {
				System.out.println("El numero " + numero[i] + " es par.");
			} else {
				System.out.println("El numero " + numero[i] + " es impar.");
			}
		}
	}
	
}
