package Aldagaia_Ariketak;

import java.util.Scanner;

public class Ariketa_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("*****************************************");
		System.out.println("                 BANCO                   ");
		System.out.println("*****************************************");

		System.out.println();
		
		System.out.println("Dime cuanto dinero tienes?");
		Scanner teclado = new Scanner(System.in);
		String katea = teclado.nextLine();
		int saldo = Integer.parseInt(katea);
		
		if (saldo > 0) {
			System.out.println("Su saldo es 'ACREDOR'");
		} else if (saldo < 0) {
			System.out.println("Su saldo es 'DEUDA'");
		} else {
			System.out.println("Su saldo es 'NULL'");
		}
		
		System.out.println("Quieres meter dinero?");
		System.out.println("1.SI");
		System.out.println("2.NO");
		katea = teclado.nextLine();
		int opcion = Integer.parseInt(katea);
		
		switch(opcion) {
			
		case 1:
				System.out.println("Cuanto diero quieres meter?");
				katea = teclado.nextLine();
				saldo = Integer.parseInt(katea);
				
				System.out.println("Ahora volvere a mostrarte que tipo de saldo tienes.");
				
				if (saldo > 0) {
					System.out.println("Su saldo es 'ACREDOR'");
				} else if (saldo < 0) {
					System.out.println("Su saldo es 'DEUDA'");
				} else {
					System.out.println("Su saldo es 'NULL'");
				}
				break;
			case 2:
				System.out.println("Se acabo el programa.");
				break;
			default:
				System.out.println("Esa no es una opcion valida.");
				break;
		}
		teclado.close();
	}

}
