package Arrays;

import java.util.Scanner;

public class Ariketa5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		String[] nombre;
		nombre = new String[5];
		
		int[] nota;
		nota = new int[5];
		
		arrayIzenaKargatu(nombre, teclado);
		
		System.out.println();
		
		arrayNotaKargatu(nota, teclado);
		
		System.out.println();
		
		datuGuztiakKargatu(nombre, nota);	
		
		System.out.println();
		
		datuakKalkulatu(nombre, nota);
	}
	
	private static void arrayIzenaKargatu(String[] nombre, Scanner teclado) {
				
		for (int i = 0; i < nombre.length; i ++) {
			System.out.println("Cual es tu nombre?");
			nombre[i] = teclado.nextLine();
		}
		
		for (int j = 0; j < nombre.length; j ++) {
			System.out.println("Estos son los nombres introducido: " + nombre[j]);
		}
	}
	
	private static void arrayNotaKargatu(int[] nota, Scanner teclado) {
				
		for (int i = 0; i < nota.length; i ++) {
			System.out.println("Cual es la nota?");
			String katea = teclado.nextLine();
			nota[i] = Integer.parseInt(katea);
		}
		
		for (int j = 0; j < nota.length; j ++) {
			System.out.println("Estas son las notas obtenidas: " + nota[j]);
		}
	}
	
	private static void datuGuztiakKargatu(String[] nombre, int[] nota) {
		
		for (int i = 0; i < nombre.length; i ++) {
			System.out.println("Nombre: " + nombre[i]);
			System.out.println("Nota: " + nota[i]);
			System.out.println();
		}
	}
	
	private static void datuakKalkulatu(String[] nombre, int[] nota) {
		
		String nombreMax = nombre[0];
		int notaMax = nota[0];
		
		String nombreMin = nombre[0];
		int notaMin = nota[0];
		
		for (int i = 1; i < nota.length; i ++) {
			if (nota[i] > notaMax) {
				notaMax = nota[i];
				nombreMax = nombre[i];
			}
		}
		System.out.println("La nota mas alta es: " + notaMax);
		System.out.println("El nombre de la nota es: " + nombreMax);
		
		for (int j = 1; j < nota.length; j ++) {
			if (nota[j] < notaMin) {
				notaMin = nota[j];
				nombreMin = nombre[j];
			}
		}
		System.out.println("La nota mas baja es: " + notaMin);
		System.out.println("El nombre de la nota es: " + nombreMin);
	}

}
