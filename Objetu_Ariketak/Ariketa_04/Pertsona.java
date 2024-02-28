package Ariketa_04;

import java.util.Scanner;

public class Pertsona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pertsona_Test pertsona = new Pertsona_Test();
		Scanner sc = new Scanner(System.in);
		String katea = "";
		
		System.out.println("Zein da zure izena?");
		katea = sc.nextLine();
		pertsona.setIzena(katea);
		
		System.out.println("Zein da zure adina?");
		katea = sc.nextLine();
		pertsona.setAdina(katea);
		
		System.out.println("Zein da zure NAN zenbakia");
		katea = sc.nextLine();
		pertsona.setNan(katea);
		
		System.out.println("Zein da zure sexua?");
		System.out.println("0. Emakumea");
		System.out.println("1. Gizona");
		katea = sc.nextLine();
		int aukera = Integer.parseInt(katea);
		
		if (aukera == 0) {
			pertsona.setSex("Emakumea");
		} else {
			pertsona.setSex("Gizona");
		}
		
		System.out.println("Zein da zure pisua?");
		katea = sc.nextLine();
		pertsona.setPisua(katea);
		
		System.out.println("Zein da zure altuera?");
		katea = sc.nextLine();
		pertsona.setAltuera(katea);
		
		System.out.println(pertsona.getIzena());
		System.out.println(pertsona.getAdina());
		System.out.println(pertsona.getNan());
		System.out.println(pertsona.getSex());
		System.out.println(pertsona.getPisua());
		System.out.println(pertsona.getAltuera());
		
		sc.close();
		
	}

}
