package Repaso_Ariketak.Objetos;

import java.util.Scanner;

public class Ariketa_8 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingrese el número de piso al que desea subir:");
	        int pisoDestino = scanner.nextInt();

	        subirAPiso(pisoDestino);

	        scanner.close();
	    }

	    public static void subirAPiso(int pisoDestino) {
	        System.out.println("El ascensor está subiendo...");

	        for (int pisoActual = 0; pisoActual <= pisoDestino; pisoActual++) {
	            System.out.println("Piso " + pisoActual);
	        }

	        System.out.println("Ha llegado al piso " + pisoDestino);
	    }
	}
