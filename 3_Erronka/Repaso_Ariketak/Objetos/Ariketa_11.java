package Repaso_Ariketak.Objetos;

import java.util.Scanner;

public class Ariketa_11 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese un número: ");
	        int numero = scanner.nextInt();

	        System.out.println("Números pares hasta " + numero + ":");
	        mostrarNumerosPares(numero);

	        scanner.close();
	    }

	    public static void mostrarNumerosPares(int numero) {
	        for (int i = 2; i <= numero; i += 2) {
	            System.out.print(i + " ");
	        }
	        System.out.println();
	    }
}
