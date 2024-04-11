package Objetuak;

import java.util.Scanner;

public class Ariketa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ariketa2Ob pertsona = new Ariketa2Ob();
		Ariketa2Ob pertsona2 = new Ariketa2Ob();
		
		Scanner teclado = new Scanner(System.in);
		
		datuakEskatu(pertsona, teclado);
		System.out.println();
		datuakEskatu(pertsona2, teclado);
		System.out.println();
		datuakAtera(pertsona);
		System.out.println();
		datuakAtera(pertsona2);
		System.out.println();
		handiena(pertsona, pertsona2);
	}
	
	public static void datuakEskatu (Ariketa2Ob pertsona, Scanner teclado) {
								
			System.out.println("Zein da zure izena?");
			String izena = teclado.nextLine();
			pertsona.setIzena(izena);
			
			System.out.println();
			
			System.out.println("Zein da zure abizena?");
			String abizena = teclado.nextLine();
			pertsona.setAbizena(abizena);
			
			System.out.println();
			
			System.out.println("Zein da zure adina?");
			int adina = Integer.parseInt(teclado.nextLine());
			pertsona.setAdina(adina);
			
			
			System.out.println();
			
			System.out.println("Ezkonduta zaude? (bai/ez)");
			String ezkonduta = teclado.nextLine();
			boolean ezkondua = false;
			if (ezkonduta.equalsIgnoreCase("bai")) {
				ezkondua = true;
			} else {
				ezkondua = false;
			}
			pertsona.setEzkondua(ezkondua);
			
			System.out.println("Zein da zure NAN?");
			String nan = teclado.nextLine();
			pertsona.setNan(nan);
	}
	
	public static void datuakAtera (Ariketa2Ob pertsona) {
						
				System.out.println(pertsona.getIzena());
				System.out.println(pertsona.getAbizena());
				System.out.println(pertsona.getAdina());
				System.out.println(pertsona.isEzkondua());
				System.out.println(pertsona.getNan());
			
			}
	
	public static void handiena (Ariketa2Ob pertsona, Ariketa2Ob pertsona2) {
		
		if (pertsona.getAdina() > pertsona2.getAdina()) {
			System.out.println(pertsona.getIzena() + " zaharragoa da.");
		} else {
			System.out.println(pertsona2.getIzena() + " zaharragoa da.");

		}
		
	}
	
}

