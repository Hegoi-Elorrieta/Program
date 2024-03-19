package Metodoak;

import java.util.Scanner;

public class Ariketa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Mete un numero.");
		Scanner teclado = new Scanner(System.in);
		String katea = teclado.nextLine();
		int zbk1 = Integer.parseInt(katea);
		
		System.out.println("Dame otro numero.");
		katea = teclado.nextLine();
		int zbk2 = Integer.parseInt(katea);
		
		handienada(zbk1, zbk2);
		
		teclado.close();

	}
	
	public static void handienada (int zbk1, int zbk2) {
		
		if (zbk1 > zbk2) {
			System.out.println("El primer numero: " + "'" + zbk1 + "'" + " es mayor que el segundo numero: " + "'" + zbk2 + "'");
		} else if (zbk1 < zbk2) {
			System.out.println("El primer numero: " + "'" + zbk1 + "'" + " es menor que el segundo numero: " + "'" + zbk2 + "'");
		} else {
			System.out.println("El primer numero: " + "'" + zbk1 + "'" + " y el segundo numero: " + "'" + zbk2 + "' son iguales.");
		}
	}

}
