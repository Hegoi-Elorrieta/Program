package Azterketa.Ariketak;

import java.util.Scanner;

public class Aldagaiak_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Zenbat galdera ditu testa?");
		Scanner teklatua = new Scanner(System.in);
		String katea = teklatua.nextLine();
		int galderaKop = Integer.parseInt(katea);
		
		System.out.println("Zenbat galdera ondo egin dituzu.");
		katea = teklatua.nextLine();
		int galderaOndo = Integer.parseInt(katea);
		
		int ehunekoa = 0;
		
		ehunekoa = 100 * galderaOndo / galderaKop;
		System.out.println("Hau da galdera ondo egin duzuen ehunekoa: " + ehunekoa + "%");
		
		if (ehunekoa >= 90) {
			System.out.println("Gehienezko maila.");
		} else if (ehunekoa >= 75 && ehunekoa < 90) {
			System.out.println("Maila ertaina.");
		} else if (ehunekoa >= 50 && ehunekoa < 75) {
			System.out.println("maila arrunta.");
		} else {
			System.out.println("Mailaz kanpo.");
		}

		teklatua.close();
		
	}

}
