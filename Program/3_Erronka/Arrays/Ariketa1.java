package Arrays;

import java.util.Scanner;

public class Ariketa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] edad = new int[20];
		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < 20; i ++) {
			System.out.println("Mete " + (i + 1) + " edad del alumno.");
			edad[i] = leerEdades(teclado);
		}
		
		imprimirEdades(edad);
		System.out.println("Edad media: " + calcularMedia(edad));
		
	}
	
	public static int leerEdades(Scanner teclado) {
		
		int adina;
		
		do {
			System.out.println("Edad: ");
			while (!teclado.hasNext()) {
				System.out.println("La edad tiene que ser un numero positivo.");
				System.out.println("Edad: ");
				teclado.next();
			}
			
			adina = teclado.nextInt();
			
			if (adina < 18 || adina > 35) {
				System.out.println("La edad tiene que estar entre 18 y 35");
			}
		} while (adina < 18 || adina > 35);
		return adina;
	}
	
	public static double calcularMedia(int[] edad) {
		
		int total = 0;
		
		for (int edade : edad) {
			total += edade;
		}
		
		return (double) total / edad.length;
		
	}
	
	public static void imprimirEdades(int[] edad) {
		
		System.out.println("Edad de los alumnos:");
		
		for (int i = 0; i < edad.length; i ++) {
			System.out.println((i + 1) + " edad del alumno: " + edad[i]);
		}
		
	}

}
