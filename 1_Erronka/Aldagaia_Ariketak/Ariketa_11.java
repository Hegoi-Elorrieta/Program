package Aldagaia_Ariketak;

import java.util.Scanner;

public class Ariketa_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("KALKULAGAILUAREN MENUA");
		System.out.println("Heman zenbaki bat:");
		String katea = sc.nextLine();
		int zbk1 = Integer.parseInt(katea);
		
		System.out.println("Heman beste zenbaki bat:");
		katea = sc.nextLine();
		int zbk2 = Integer.parseInt(katea);
		
		System.out.println("1.Batuketa.");
		System.out.println("2.Kenketa.");
		System.out.println("3.Biderketa.");
		System.out.println("4.Zatiketa.");
		System.out.println("5.Atera.");
		
		katea = sc.nextLine();
		int emaitza = Integer.parseInt(katea);
		
		switch (emaitza) {
		case 1: emaitza = zbk1 + zbk2;
				System.out.println("Emaitza: ");
				System.out.println(zbk1 + "+" + zbk2 + "=" + emaitza);
				break;
		case 2:
				emaitza = zbk1 - zbk2;
				System.out.println("Emaitza: ");
				System.out.println(zbk1 + "-" + zbk2 + "=" + emaitza);
				break;
		case 3:
				emaitza = zbk1 * zbk2;
				System.out.println("Emaitza: ");
				System.out.println(zbk1 + "*" + zbk2 + "=" + emaitza);
				break;
		case 4:
				emaitza = zbk1 / zbk2;
				System.out.println("Emaitza: ");
				System.out.println(zbk1 + "/" + zbk2 + "=" + emaitza);
				break;
		case 5:
				System.out.println("Agur!");
				break;
		default:
			System.out.println("Batetik bostera zenbaki bat izan behar da.");
			break;
			
		}
		sc.close();
	}

}
