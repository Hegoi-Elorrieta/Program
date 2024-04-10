package Objetuak;

import java.util.Scanner;

public class Ariketa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ariketa1Ob coche = new Ariketa1Ob();
		Scanner teclado = new Scanner(System.in);
		String katea = "";
		
		System.out.println("Probincias posibles:");
		
		System.out.println();
		
		System.out.println("Bizkaia");
		System.out.println("Gipuzkoa");
		System.out.println("Vitoria");
		
		System.out.println();
		
		System.out.println("Cual es la probincia donde se encuentra tu coche?");
		katea = teclado.nextLine();
		coche.setProbintzia(katea);
		
		System.out.println();
		
		System.out.println("Cual es la matricula de tu coche?");
		katea = teclado.nextLine();
		coche.setMatrikula(katea);
		
		System.out.println();
		
		System.out.println("Cual es el municipio donde se encuentra tu coche?");
		katea = teclado.nextLine();
		coche.setUdalerria(katea);
		
		System.out.println();
		
		System.out.println("Cual es el tipo de motor de su coche");
		System.out.println();
		System.out.println("0.Desconocido");
		System.out.println("1.Diesel");
		System.out.println("2.Gasolina");
		katea = teclado.nextLine();
		int opcion = Integer.parseInt(katea);
		
		if (opcion == 0) {
			coche.setMotorra("Desconocido");
		} else if (opcion == 1) {
			coche.setMotorra("Diesel");
		} else {
			coche.setMotorra("Gasolina");
		}
		
		teclado.close();
		
		System.out.println();
		System.out.println("*************");
		System.out.println("*Descripcion*");
		System.out.println("*************");
		System.out.println();
		
		System.out.println(coche.getProbintzia());
		System.out.println();
		System.out.println(coche.getMatrikula());
		System.out.println();
		System.out.println(coche.getUdalerria());
		System.out.println();
		System.out.println(coche.getMotorra());
		
	}

}
