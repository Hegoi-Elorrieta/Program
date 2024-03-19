package Aldagaia_Ariketak;

import java.util.Scanner;

public class Ariketa_15B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("*****************************************");
		System.out.println("                 BANCO                   ");
		System.out.println("*****************************************");

		System.out.println();
		
		System.out.println("Dime cuantas cuentas bancarias quieres meter?");
		Scanner teclado = new Scanner(System.in);
		String katea = teclado.nextLine();
		int cuentas = Integer.parseInt(katea);
		
		for(int i = 0; i < cuentas; i++) {
			
			System.out.println("Cual es tu nombre?");
			String nombre;
			nombre = teclado.nextLine();
			
			System.out.println("Cual es tu pais?");
			String pais;
			pais = teclado.nextLine();
			
			System.out.println("En que ciudad vives?");
			String ciudad;
			ciudad = teclado.nextLine();
			
			System.out.println("Dime cuanto dinero tienes?");
			katea = teclado.nextLine();
			int saldo = Integer.parseInt(katea);
			
			System.out.println("Quieres meter dinero?");
			System.out.println("1.SI");
			System.out.println("2.NO");
			katea = teclado.nextLine();
			int opcion = Integer.parseInt(katea);
			
			switch(opcion) {
				
			case 1:
					System.out.println("Cuanto diero quieres meter?");
					katea = teclado.nextLine();
					int nuevo = Integer.parseInt(katea);
					break;
					
				case 2:
					System.out.println("Agur!");
					break;
					
				default:
					System.out.println("Esa no es una opcion valida.");
					break;
			}
						
			System.out.println();
			System.out.println("*****Descripcion*****");
			System.out.println();
			
			System.out.println("Nombre: " + nombre);
			System.out.println("Pais: " + pais);
			System.out.println("Ciudad: " + ciudad);
			System.out.println("Numero de cuenta: " + cuentas);
			System.out.println("Nuevo suma de saldo: " + nuevo);
			System.out.println("Saldo disponible: " + saldo + "€");
			
			if (saldo > 0) {
				System.out.println("Su saldo es 'ACREDOR'");
			} else if (saldo < 0) {
				System.out.println("Su saldo es 'DEUDA'");
			} else {
				System.out.println("Su saldo es 'NULL'");
			}
			
		}
		teclado.close();
	}

}
