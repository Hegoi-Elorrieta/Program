package Azterketa.Ariketak;

import java.util.Scanner;

public class Aldagaiak_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Zein da zure soldata? ");
		Scanner teklatua = new Scanner(System.in);
		String katea = teklatua.nextLine();
		int soldata = Integer.parseInt(katea);
		
		if (soldata >= 3000) {
			System.out.println("Zergak ordaindu behar dituzu.");
		} else {
			System.out.println("Ez dituzu zergak ordaindu behar.");
		}
		
		teklatua.close();
		
	}

}
