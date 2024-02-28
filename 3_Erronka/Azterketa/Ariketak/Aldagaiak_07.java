package Azterketa.Ariketak;

import java.util.Scanner;

public class Aldagaiak_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Heman zenbaki bat: ");
		Scanner teklatua = new Scanner(System.in);
		String katea = teklatua.nextLine();
		int astekoEguna = Integer.parseInt(katea);
		
		switch (astekoEguna) {
		
		case 1:
			
			System.out.println("Asteko lehen eguna da: Astelehena.");
			break;
			
		case 2:
			
			System.out.println("Asteko bigarren eguna da: Asteartea.");
			break;
			
		case 3:
			
			System.out.println("Asteko hirugarren eguna da: Asteazkena.");
			break;
			
		case 4:
			
			System.out.println("Asteko laugarren eguna da: Osteguna.");
			break;
			
		case 5:
			
			System.out.println("Asteko bostgarren eguna da: Ostirala.");
			break;
			
		case 6:
			
			System.out.println("Asteko seigarren eguna da: Larunbata.");
			break;
			
		case 7:
			
			System.out.println("Asteko zazpigarren eguna da: Igandea.");
			break;
			
		default:
			
			System.out.println("Asteko egun hori ez da existitzen.");
		}

		teklatua.close();
		
	}

}
