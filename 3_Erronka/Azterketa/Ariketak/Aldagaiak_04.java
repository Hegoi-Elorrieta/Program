package Azterketa.Ariketak;

import java.util.Scanner;

public class Aldagaiak_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Zein da zure adina? ");
		Scanner teklatua = new Scanner(System.in);
		String katea = teklatua.nextLine();
		int adina = Integer.parseInt(katea);
		
		if (adina >= 18) {
			System.out.println("Adin nagusikoa zara: " + adina);
		} else {
			System.out.println("Adin txikikoa zara: " + adina);
		}
		
		teklatua.close();
	}

}
