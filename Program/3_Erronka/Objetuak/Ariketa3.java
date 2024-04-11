package Objetuak;

import java.util.Scanner;

public class Ariketa3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ariketa3Ob pertsona = new Ariketa3Ob();
		
		Scanner teclado = new Scanner(System.in);
		
		datuakEskatu(pertsona, teclado);
		System.out.println();
		datuakAtera(pertsona);
		
	}
	
	public static void datuakEskatu(Ariketa3Ob pertsona, Scanner teclado) {
		
		System.out.println("Zein da zure izena?");
		String izena = teclado.nextLine();
		pertsona.setIzena(izena);
		
		System.out.println();
		
		System.out.println("Zein da zure adina?");
		int adina = Integer.parseInt(teclado.nextLine());
		pertsona.setAdina(adina);
		
		System.out.println();
		
		System.out.println("Zein da zure nan?");
		String nan = teclado.nextLine();
		pertsona.setNan(nan);
		
		System.out.println();
		
		System.out.println("Zein da zure sexua? (H/G)");
		String sexua = teclado.nextLine();
		if (sexua.equalsIgnoreCase("G")) {
			pertsona.setSexua("Gizona");
		} else if (sexua.equalsIgnoreCase("H")) {
			pertsona.setSexua("Hemakumea");
		} else {
			System.out.println("H edo G izan behar da.");
		}
		
		System.out.println();
		
		System.out.println("Zein da zure pisua?");
		float pisua = Float.parseFloat(teclado.nextLine());
		pertsona.setPisua(pisua);
		
		System.out.println();
		
		System.out.println("Zein da zure altuera?");
		float altuera = Float.parseFloat(teclado.nextLine());
		pertsona.setAltuera(altuera);
		
	}
	
	public static void datuakAtera(Ariketa3Ob pertsona) {
		System.out.println(pertsona.getIzena());
		System.out.println(pertsona.getAdina());
		System.out.println(pertsona.getNan());
		System.out.println(pertsona.getSexua());
		System.out.println(pertsona.getPisua());
		System.out.println(pertsona.getAltuera());
	}

}
