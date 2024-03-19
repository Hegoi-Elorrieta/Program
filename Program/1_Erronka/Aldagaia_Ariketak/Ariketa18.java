package Aldagaia_Ariketak;

import java.util.Scanner;

public class Ariketa18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("*******************************");
		System.out.println("**********Calculadora**********");
		System.out.println("*******************************");
		
		System.out.println();
		
		int zbk1;
		int zbk2;
		int opcion;
		
		do  {
			
			System.out.println("Elige una opcion.");
			System.out.println("1.Suma.");
			System.out.println("2.Resta.");
			System.out.println("3.Division.");
			System.out.println("4.Multiplicacion.");
			System.out.println("5.Salir.");
			
			Scanner teclado = new Scanner(System.in);
			String katea = teclado.nextLine();
			opcion = Integer.parseInt(katea);
			
			switch (opcion) {
			
			case 1:
				
				System.out.println("Dame un numero.");
				katea = teclado.nextLine();
				zbk1 = Integer.parseInt(katea);
				
				System.out.println("Dame otro numero.");
				katea = teclado.nextLine();
				zbk2 = Integer.parseInt(katea);
				
				System.out.println(zbk1 + "+" + zbk2 + "=" + (zbk1 + zbk2));
				System.out.println();
				
				break;
				
			case 2:
				
				System.out.println("Dame un numero.");
				katea = teclado.nextLine();
				zbk1 = Integer.parseInt(katea);
				
				System.out.println("Dame otro numero.");
				katea = teclado.nextLine();
				zbk2 = Integer.parseInt(katea);
				
				System.out.println(zbk1 + "-" + zbk2 + "=" + (zbk1 - zbk2));
				System.out.println();
				
				break;
				
			case 3:
				
				System.out.println("Dame un numero.");
				katea = teclado.nextLine();
				zbk1 = Integer.parseInt(katea);
				
				System.out.println("Dame otro numero.");
				katea = teclado.nextLine();
				zbk2 = Integer.parseInt(katea);
				
				System.out.println(zbk1 + "/" + zbk2 + "=" + (zbk1 / zbk2));
				System.out.println();
				
				break;
				
			case 4:
				
				System.out.println("Dame un numero.");
				katea = teclado.nextLine();
				zbk1 = Integer.parseInt(katea);
				
				System.out.println("Dame otro numero.");
				katea = teclado.nextLine();
				zbk2 = Integer.parseInt(katea);
				
				System.out.println(zbk1 + "*" + zbk2 + "=" + (zbk1 * zbk2));
				System.out.println();
				
				break;
				
			case 5:
				
				System.out.println("Salir.");
				
				break;
				
			default:
				
				System.out.println("Elige una opcion del 1 al 5.");
				System.out.println();
				
			}
			teclado.close();
		} while (opcion != 5);
	}

}
