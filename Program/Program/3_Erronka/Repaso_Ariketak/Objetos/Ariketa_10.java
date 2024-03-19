package Repaso_Ariketak.Objetos;

import java.util.Scanner;

public class Ariketa_10 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese su género (M/F): ");
	        char genero = scanner.next().charAt(0);

	        String nombre = obtenerNombrePorGenero(genero);

	        System.out.println("Su nombre es: " + nombre);

	        scanner.close();
	    }

	    public static String obtenerNombrePorGenero(char genero) {
	        Scanner scanner = new Scanner(System.in);
	        String nombre = "";

	        if (genero == 'M' || genero == 'm') {
	            System.out.print("Ingrese el nombre del varón: ");
	            nombre = scanner.nextLine();
	        } else if (genero == 'F' || genero == 'f') {
	            System.out.print("Ingrese el nombre de la mujer: ");
	            nombre = scanner.nextLine();
	        } else {
	            System.out.println("Género no reconocido.");
	        }

	        return nombre;
	        
	        }

	    }
