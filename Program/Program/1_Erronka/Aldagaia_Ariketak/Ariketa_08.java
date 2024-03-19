package Aldagaia_Ariketak;

import java.util.Scanner;

public class Ariketa_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Codigo de la suma del primer numero
		System.out.println("Primer numero:");
		Scanner teclado = new Scanner(System.in);
		String katea = teclado.nextLine();
		int Primernumero = Integer.parseInt(katea);
				
		//Codigo de la suma del primer numero
		System.out.println("Segundo numero:");
		katea = teclado.nextLine();
		int Segundonumero = Integer.parseInt(katea);
				
		//Codigo de la suma
		System.out.print("Suma de los dos numeros: ");
		System.out.print(Primernumero + Segundonumero);
		
		teclado.close();
	}
}
