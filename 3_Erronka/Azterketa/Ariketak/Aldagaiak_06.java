package Azterketa.Ariketak;

import java.util.Scanner;

public class Aldagaiak_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Heman zenbaki bat: ");
		Scanner teklatua = new Scanner(System.in);
		String katea = teklatua.nextLine();
		int zbk1 = Integer.parseInt(katea);
		
		System.out.println("Heman bigarren zenbaki bat: ");
		katea = teklatua.nextLine();
		int zbk2 = Integer.parseInt(katea);
		
		System.out.println("Heman hirugarren zenbaki bat: ");
		katea = teklatua.nextLine();
		int zbk3 = Integer.parseInt(katea);
		
		if (zbk1 > zbk2 && zbk1 > zbk3) {
			System.out.println("Lehenengo zenbakia handiena da. " + zbk1);
		} else if (zbk2 > zbk1 && zbk2 > zbk3) {
			System.out.println("Bigarren zenbakia handiena da. " + zbk2);
		} else if (zbk3 > zbk1 && zbk3 > zbk2) {
			System.out.println("Hirugarren zenbakia handiena da. " + zbk3);
		} else {
			System.out.println("Zenbaki guztiak berdinak dira.");
		}
		
		teklatua.close();
		
	}

}
