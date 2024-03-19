package Repaso_Ariketak.Objetos;

import java.util.Scanner;

public class Ariketa_12 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese un número: ");
	        int numero = scanner.nextInt();

	        mostrarDobleOtriple(numero);

	        scanner.close();
	    }

	    public static void mostrarDobleOtriple(int numero) {
	        if (numero % 2 == 0) {
	            System.out.println("El doble de " + numero + " es: " + (numero * 2));
	        } else {
	            System.out.println("El triple de " + numero + " es: " + (numero * 3));
	        }
	    }
	}
