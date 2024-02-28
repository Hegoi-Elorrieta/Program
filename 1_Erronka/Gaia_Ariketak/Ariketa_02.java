package Gaia_Ariketak;

import java.util.Scanner;

public class Ariketa_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Sartu zure adina mesedez: ");
		String katea = sc.nextLine();
		float adina = Integer.parseInt(katea);
		
		if(adina >= 18) {
			System.out.println("Adin nagusikoa zara.");
		} else {
			System.out.println("Ez zara adin nagusikoa.");
		}
		sc.close();
	}

}
