package Azterketa.Ariketak;

import java.util.Scanner;

public class Aldagaiak_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Heman zenbaki bat: ");
		Scanner teklatua = new Scanner(System.in);
		String katea = teklatua.nextLine();
		int a = Integer.parseInt(katea);
		
		System.out.println("Heman beste zenbaki bat: ");
		katea = teklatua.nextLine();
		int b = Integer.parseInt(katea);
		
		if (a > b) {
			System.out.println("Lehenengo zenbakia handiena da: " + a);
		} else if (a < b) {
			System.out.println("Bigarren zenbakia handiena da: " + b);
		} else {
			System.out.println("Biak berdinak dira: " + a + ", " + b);
		}

		teklatua.close();
		
	}	

}
