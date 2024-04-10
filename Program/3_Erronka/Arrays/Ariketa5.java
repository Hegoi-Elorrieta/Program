package Arrays;

import java.util.Scanner;

public class Ariketa5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		String[] nombre;
		nombre = new String[5];
		
		int[] nota;
		nota = new int[5];
		
		datos(nombre, nota, teclado);
		System.out.println();
		imprimirDatos(nombre, nota);
		System.out.println();
		double notaMedia = notaMedia(nota);
		System.out.println("Esta es la nota media de los estudiantes: " + notaMedia);

	}
	
	private static void datos(String[] nombre, int[] nota, Scanner teclado) {
		
		for (int i = 0; i < nombre.length; i ++) {
			System.out.println("Dime cual es tu nombre:");
			String nom = teclado.nextLine();
			nombre[i] = nom;
			
			System.out.println("Dime cual es tu nota:");
			String katea = teclado.nextLine();
			int zbk = Integer.parseInt(katea);
			nota[i] = zbk;
		}
	}
	
	private static void imprimirDatos(String[] nombre, int[] nota) {
		
		System.out.println("Estos son los datos de los estudiantes:");
		
		for (int i = 0; i < nombre.length; i ++) {
			System.out.println("Nombre del estudiante: " + nombre[i]);
			System.out.println("Nota del estudiante: " + nota[i]);
			
			if (nota[i] >= 5) {
				System.out.println("Apto");
			} else {
				System.out.println("No apto");
			}
			
			System.out.println();
		}
	}
	
	private static double notaMedia(int[] nota) {
		double media = 0;
		
		for (int i = 0; i < nota.length; i ++) {
			media += nota[i];
		}
		return media / nota.length;
	}
	
}
