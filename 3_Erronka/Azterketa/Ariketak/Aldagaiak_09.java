package Azterketa.Ariketak;

import java.util.Scanner;

public class Aldagaiak_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubd
		
		System.out.println("******************");
		System.out.println("Kalkulagailua");
		System.out.println("******************");
		
		System.out.println("Sartu 1.Zenbakia: ");
		
		Scanner teklatua = new Scanner(System.in);
		String katea = teklatua.nextLine();
		int zbk1 = Integer.parseInt(katea);
		System.out.println("Sartu 2.Zenbakia: ");
		katea = teklatua.nextLine();
		int zbk2 = Integer.parseInt(katea);
		
		System.out.println("Sartu nahi duzun aukera:");
		katea = teklatua.nextLine();
		int emaitza = Integer.parseInt(katea);
		
		System.out.println("Batuketa.");
		System.out.println("Kenketa.");
		System.out.println("Biderketa.");
		System.out.println("Zatiketa.");
		System.out.println("Atera");
		
		switch (emaitza) {
		
		case 1:
			
			emaitza = zbk1 + zbk2;
			System.out.println("Emaitza: " + zbk1 + "+" + zbk2 + "=" + emaitza);
			break;
			
		case 2:
			
			emaitza = zbk1 + zbk2;
			System.out.println("Emaitza: " + zbk1 + "-" + zbk2 + "=" + emaitza);
			break;
			
		case 3:
			
			emaitza = zbk1 * zbk2;
			System.out.println("Emaitza: " + zbk1 + "*" + zbk2 + "=" + emaitza);
			break;
			
		case 4:
			
			emaitza = zbk1 / zbk2;
			System.out.println("Emaitza: " + zbk1 + "/" + zbk2 + "=" + emaitza);
			break;
			
		case 5:
			
			System.out.println("Agur.");
			break;
			
		default:
		
			System.out.println("Aukeratu 1-tik 5-era");
			break;
			
		}
		
		teklatua.close();
		
	}

}
