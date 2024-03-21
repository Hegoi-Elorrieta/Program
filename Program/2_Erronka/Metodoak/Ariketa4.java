package Metodoak;

import java.util.Scanner;

public class Ariketa4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int zbk1 = 0;
		int zbk2 = 0;
		int opcion;
		
		System.out.println("*******************************");
		System.out.println("**********Calculadora**********");
		System.out.println("*******************************");
		
		System.out.println();
		
		do {
			
			System.out.println("Elige una opcion.");
			System.out.println("1.Suma.");
			System.out.println("2.Resta.");
			System.out.println("3.Division.");
			System.out.println("4.Multiplicacion.");
			System.out.println("5.Salir.");
			
			Scanner teclado = new Scanner(System.in);
			String katea = teclado.nextLine();
			opcion = Integer.parseInt(katea);
			
			System.out.println();
			
			System.out.println("Dame un numero.");
			katea = teclado.nextLine();
			zbk1 = Integer.parseInt(katea);
			
			System.out.println("Dame otro numero.");
			katea = teclado.nextLine();
			zbk2 = Integer.parseInt(katea);
			
			switch (opcion) {
			case 1:
				suma(zbk1, zbk2);
				break;
			case 2:
				resta(zbk1, zbk2);
				break;
			case 3:
				division(zbk1, zbk2);
				break;
			case 4:
				multiplicacion(zbk1, zbk2);
				break;
			case 5:
				salir();
				break;
			default:
				System.out.println("Elige una opcion del 1 al 5.");
			}
			
		} while (opcion != 5);

	}
	
	public static void suma(int zbk1, int zbk2) {
		int resultado = zbk1 + zbk2;
		System.out.println(zbk1 + "+" + zbk2 + "=" + resultado);
	}
	
	public static void resta(int zbk1, int zbk2) {
		int resultado = zbk1 - zbk2;
		System.out.println(zbk1 + "-" + zbk2 + "=" + resultado);
	}
	
	public static void division(int zbk1, int zbk2) {
		int resultado = zbk1 / zbk2;
		System.out.println(zbk1 + "/" + zbk2 + "=" + resultado);
	}
	
	public static void multiplicacion(int zbk1, int zbk2) {
		int resultado = zbk1 * zbk2;
		System.out.println(zbk1 + "*" + zbk2 + "=" + resultado);
	}
	
	public static void salir() {
		System.out.println("Se a acabado el programa.");
	}

}
