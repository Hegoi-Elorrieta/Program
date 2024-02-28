package Ariketa_03;

import java.util.Scanner;

public class KotxeaApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int zenbat;
		Kotxea kotxea = new Kotxea();
		
		do {
			System.out.println("Sartu abiadura aldaketa (0 bukatzeko): ");
			zenbat = Integer.parseInt(sc.nextLine());
			if (zenbat > 0) {
				kotxea.bizkortu(zenbat);
			} else if (zenbat < 0) {
				kotxea.geldotu(zenbat);
			} else {
				System.out.println("Bukatu.");
			}
			System.out.println("Egungo abiadura: " + kotxea.getAbiadura());
		}while (zenbat != 0);
		sc.close();
	}
}
