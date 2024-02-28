package Repaso_Ariketak.Objetos;

import java.util.Scanner;

public class Ariketa_5 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingrese un número decimal para convertir a binario:");
	        int numeroDecimal = scanner.nextInt();

	        String binario = convertirDecimalABinario(numeroDecimal);

	        System.out.println("El número binario correspondiente es: " + binario);

	        scanner.close();
	    }

	    public static String convertirDecimalABinario(int numeroDecimal) {
	        if (numeroDecimal == 0) {
	            return "0"; // Si el número es 0, su representación binaria es 0
	        }

	        StringBuilder binario = new StringBuilder();

	        while (numeroDecimal > 0) {
	            int residuo = numeroDecimal % 2; // Calcula el residuo de dividir por 2
	            binario.insert(0, residuo); // Inserta el residuo al inicio del string binario
	            numeroDecimal /= 2; // Divide el número por 2 para la próxima iteración
	        }

	        return binario.toString();
	    }
		
}
