package Aldagaia_Ariketak;

import java.util.Scanner;

public class Ariketa_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teklatua = new Scanner(System.in);
		System.out.println("Primer numero");
		String katea = teklatua.nextLine();
		float Primero = Integer.parseInt(katea);
		System.out.println("Segundo numero");
		katea = teklatua.nextLine();
		float Segundo = Integer.parseInt(katea);
		if (Primero > Segundo) {
			System.out.println("Lehenengo zenbakia handiagoa da.");
		} else {
			System.out.println("Bigarren zenbakia handiagoa da.");
		}
		teklatua.close();
	}

}
