package Gaia_Ariketak;

import java.util.Scanner;

public class Ariketa_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Sartu zure soldata mesedez: ");
		String katea = sc.nextLine();
		float soldata = Integer.parseInt(katea);
		
		if(soldata >= 3000) {
			System.out.println("Zergak ordaindu behar dituzu.");
		} else {
			System.out.println("Ez dituzu zergak ordaindu behar.");
		}
		sc.close();
	}
}
