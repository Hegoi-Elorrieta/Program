package Repaso_Ariketak.Objetos;

import java.util.Scanner;

public class Ariketa_6 {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingrese un número entero positivo:");
	        int numero = scanner.nextInt();

	        if (numero < 0) {
	            System.out.println("El número ingresado no es válido. Debe ser positivo.");
	        } else {
	            int cifras = contarCifras(numero);
	            System.out.println("El número de cifras de " + numero + " es: " + cifras);
	        }

	        scanner.close();
	    }

	    public static int contarCifras(int numero) {
	        if (numero == 0) {
	            return 1; // Si el número es 0, tiene una cifra
	        }

	        int contador = 0;
	        while (numero != 0) {
	            numero /= 10; // Dividimos el número por 10 para eliminar la última cifra
	            contador++; // Incrementamos el contador en 1 por cada cifra eliminada
	        }
	        return contador;
	    }
}
