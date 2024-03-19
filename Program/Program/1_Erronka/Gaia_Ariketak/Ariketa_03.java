package Gaia_Ariketak;

import java.util.Scanner;

public class Ariketa_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Heman zure asterketaren nota: ");
		String katea = sc.nextLine();
		int nota = Integer.parseInt(katea);
		
		switch(nota) {
		
		case 1:
		case 2: System.out.println("GUTXIEGI");break;
			
		case 3:
		case 4: System.out.println("GUTXI");break;
			
		case 5: System.out.println("NAHIKO");break;
			
		case 6: System.out.println("ONDO");break;
			
		case 7:
		case 8: System.out.println("OSO ONDO");break;
			
		case 9:
		case 10: System.out.println("BIKAIN");break;
			
		default: System.out.println("1-tik 10-era izan behar da zenbakia.");
		}
		sc.close();
	}

}
