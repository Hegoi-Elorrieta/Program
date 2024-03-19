package Aldagaia_Ariketak;

import java.util.Scanner;

public class Ariketa_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Cuantos numeros quieres meter?");
		Scanner teclado = new Scanner(System.in);
		String katea = teclado.nextLine();
		int kant = Integer.parseInt(katea);
		
		for (int i = 0; i < kant; i++) {
			System.out.println("Cual es el numero que quieres meter?");
			katea = teclado.nextLine();
			int zbk = Integer.parseInt(katea);
			
			if (zbk % 2 == 0) {
				System.out.println("Es numero par.");
			} else {
				System.out.println("Es numero impar.");
			}
		}
		System.out.println("El programa a acabado.");
		teclado.close();
	}

}
