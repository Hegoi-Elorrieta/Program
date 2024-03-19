package Azterketa.Ariketak;

import java.util.Scanner;

public class Aldagaiak_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Zein da zure asterketaren nota? ");
		Scanner teklatua = new Scanner (System.in);
		String katea = teklatua.nextLine();
		int nota = Integer.parseInt(katea);
		
		switch (nota) {
		
		case 1:
			
		case 2:
			
			System.out.println("Zure nota gutxiegi da.");
			break;
			
		case 3:
			
		case 4:
			
			System.out.println("Zure nota gutxi da.");
			break;
			
		case 5:
			
			System.out.println("Zure nota nahiko da.");
			break;
				
		case 6:
			
			System.out.println("Zure nota ondo da.");
			break;
			
		case 7:
			
		case 8:
			
			System.out.println("Zure nota oso ondo da.");
			break;
			
		case 9:
			
		case 10:
			
			System.out.println("Zure nota bikain da.");
			break;
			
		default:
				System.out.println("Datu okerrak sartu dituzu.");
		}
		
		teklatua.close();

	}
	
}
