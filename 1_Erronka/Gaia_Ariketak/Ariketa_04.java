package Gaia_Ariketak;

import java.util.Scanner;

public class Ariketa_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner sc = new Scanner(System.in);
		System.out.println("Heman lehenengo zenbakia: ");
		String katea = sc.nextLine();
		int a = Integer.parseInt(katea);
		
		System.out.println("Heman bigarren zenbakia: ");
		katea = sc.nextLine();
		int b = Integer.parseInt(katea);
		
		System.out.println("Heman hirugarren zenbakia: ");
		katea = sc.nextLine();
		int c = Integer.parseInt(katea);
		
		if(a > b && a > c) {
			System.out.println(a + " da zenbaki handiena.");
		} else if (b > a && b > c) {
			System.out.println(b + " da zenbaki handiena.");
		} else {
			System.out.println(c + " da zenbaki handiena.");
		}
		sc.close();
	}
}
