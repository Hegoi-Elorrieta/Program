package Repaso_Ariketak.Objetos;

import java.util.Scanner;

public class Ariketa_3 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingrese un número para verificar si es primo:");
	        int numero = scanner.nextInt();

	        boolean esPrimo = esNumeroPrimo(numero);

	        if (esPrimo) {
	            System.out.println(numero + " es un número primo.");
	        } else {
	            System.out.println(numero + " no es un número primo.");
	        }

	        scanner.close();
	    }

	    public static boolean esNumeroPrimo(int numero) {
	        if (numero <= 1) {
	            return false;
	        }

	        if (numero <= 3) {
	            return true;
	        }

	        // Comprobamos si el número es divisible desde 2 hasta la raíz cuadrada del número
	        for (int i = 2; i <= Math.sqrt(numero); i++) {
	            if (numero % i == 0) {
	                return false; // Si es divisible por algún número, no es primo
	            }
	        }

	        return true; // Si no es divisible por ningún número, es primo
	    }
	
}
