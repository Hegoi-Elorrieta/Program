package Repaso_Ariketak.Arrays;

import java.util.Scanner;

public class Ariketa_1 {
	
	    public static void main(String[] args) {
	        float[] alturas = new float[5];
	        float sumaAlturas = 0;

	        Scanner scanner = new Scanner(System.in);

	        // Solicitar las alturas de las personas
	        for (int i = 0; i < alturas.length; i++) {
	            System.out.print("Ingrese la altura de la persona " + (i+1) + ": ");
	            alturas[i] = scanner.nextFloat();
	            sumaAlturas += alturas[i];
	        }

	        // Calcular el promedio
	        float promedio = sumaAlturas / alturas.length;
	        System.out.println("El promedio de las alturas es: " + promedio);

	        // Contar cuántas personas son más altas y cuántas más bajas que el promedio
	        int personasMasAltas = 0;
	        int personasMasBajas = 0;

	        for (int i = 0; i < alturas.length; i++) {
	            if (alturas[i] > promedio) {
	                personasMasAltas++;
	            } else if (alturas[i] < promedio) {
	                personasMasBajas++;
	            }
	        }

	        System.out.println("Cantidad de personas más altas que el promedio: " + personasMasAltas);
	        System.out.println("Cantidad de personas más bajas que el promedio: " + personasMasBajas);

	        scanner.close();
	    }
}
