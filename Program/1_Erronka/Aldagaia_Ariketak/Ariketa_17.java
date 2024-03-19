package Aldagaia_Ariketak;

import java.util.Scanner;

public class Ariketa_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Dime las 10 notas de los examenes:");
		
		for (int i = 0; i <= 10; i ++) {
			Scanner teclado = new Scanner(System.in);
			String katea = teclado.nextLine();
			int nota = Integer.parseInt(katea);
			
			if (nota >= 7) {
				System.out.println("Igual o mayor que 7.");
			} else {
				System.out.println("Menos que 7.");
			}
		}
		System.out.println();
		System.out.println("Terminado!");
	}
	
}
