package Aldagaia_Ariketak;

import java.util.Scanner;

public class Ariketa_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teklatua = new Scanner(System.in);
		System.out.println("Lehenengo zenbakia:");
		String katea = teklatua.nextLine();
		float Primero = Integer.parseInt(katea);
		
		System.out.println("Bigarren zenbakia");
		katea = teklatua.nextLine();
		float Segundo = Integer.parseInt(katea);
		
		System.out.println("Hirugarren zenbakia");
		katea = teklatua.nextLine();
		float Tercero = Integer.parseInt(katea);
		
		if (Primero >= Segundo & Segundo >= Tercero) {
			System.out.println("Handiena:" + Primero + "Txikiena:" + Tercero);
		}
		
		if (Primero <= Segundo & Segundo >= Tercero) {
			System.out.println("Handiena:" + Segundo + "Txikiena" + Primero);
		}
		
		if (Primero <= Segundo & Segundo <= Tercero) {
			System.out.println("Handiena:" + Tercero + "Txikiena" + Primero);
		}
		
		if (Primero >= Segundo & Segundo <= Tercero) {
			System.out.println("Handiena:" + Segundo + "Txikiena" + Tercero);
		}
		teklatua.close();
	}

}
