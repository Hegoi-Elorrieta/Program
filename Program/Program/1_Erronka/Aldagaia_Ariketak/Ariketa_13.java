package Aldagaia_Ariketak;

import java.util.Scanner;

public class Ariketa_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Sartu zenbaki bat: ");
        int zenbakiak = scanner.nextInt();

        System.out.println("Biderketa-taula " + zenbakiak + " zenbakiaren arabera:");

        for (int i = 1; i <= 10; i++) {
            System.out.println(zenbakiak + " * " + i + " = " + (zenbakiak * i));
        }

        scanner.close();

	}

}
