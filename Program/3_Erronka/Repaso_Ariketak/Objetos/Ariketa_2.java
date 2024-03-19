package Repaso_Ariketak.Objetos;

import java.util.Scanner;
import java.util.Random;

public class Ariketa_2 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingrese la cantidad de números enteros aleatorios que desea generar:");
	        int cantidadNumeros = scanner.nextInt();

	        System.out.println("Ingrese el límite inferior del rango:");
	        int limiteInferior = scanner.nextInt();

	        System.out.println("Ingrese el límite superior del rango:");
	        int limiteSuperior = scanner.nextInt();

	        generarNumerosAleatorios(cantidadNumeros, limiteInferior, limiteSuperior);

	        scanner.close();
	    }

	    public static void generarNumerosAleatorios(int cantidadNumeros, int limiteInferior, int limiteSuperior) {
	        Random random = new Random();

	        System.out.println("Números enteros aleatorios generados:");

	        for (int i = 0; i < cantidadNumeros; i++) {
	            int numeroAleatorio = random.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
	            System.out.println(numeroAleatorio);
	        }
	    }
}
