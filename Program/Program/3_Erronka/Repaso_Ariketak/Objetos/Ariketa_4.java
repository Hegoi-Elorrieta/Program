package Repaso_Ariketak.Objetos;

import java.util.Scanner;

public class Ariketa_4 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingrese un número para calcular su factorial:");
	        int numero = scanner.nextInt();

	        long factorial = calcularFactorial(numero);

	        System.out.println("El factorial de " + numero + " es: " + factorial);

	        scanner.close();
	    }

	    public static long calcularFactorial(int numero) {
	        if (numero < 0) {
	            throw new IllegalArgumentException("El número no puede ser negativo");
	        }

	        long factorial = 1;

	        // Multiplica los números anteriores hasta llegar a 1
	        for (int i = 1; i <= numero; i++) {
	            factorial *= i;
	        }

	        return factorial;
	    }

}
