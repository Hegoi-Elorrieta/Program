package Metodoak;

import java.util.Scanner;

public class Ariketa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Mete un numero:");
		
		Scanner teclado = new Scanner(System.in);
		String katea = teclado.nextLine();
		int zbk = Integer.parseInt(katea);
		
		bikoitia(zbk);
		
		teclado.close();

	}
	
	public static void bikoitia(int zbk) {
		
		if (zbk % 2 == 0) {
			System.out.println("El numero es par.");
		} else {
			System.out.println("El numero es impar.");
		}
		
	}

}
