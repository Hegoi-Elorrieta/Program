package Repaso_Ariketak.Objetos;

import java.util.Scanner;

public class Ariketa_1 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("¿Qué figura quieres calcular?");
	        System.out.println("1. Círculo");
	        System.out.println("2. Triángulo");
	        System.out.println("3. Cuadrado");
	        int opcion = scanner.nextInt();

	        switch (opcion) {
	            case 1:
	                System.out.println("Introduce el radio del círculo:");
	                double radio = scanner.nextDouble();
	                System.out.println("El área del círculo es: " + calcularAreaCirculo(radio));
	                break;
	            case 2:
	                System.out.println("Introduce la base del triángulo:");
	                double base = scanner.nextDouble();
	                System.out.println("Introduce la altura del triángulo:");
	                double altura = scanner.nextDouble();
	                System.out.println("El área del triángulo es: " + calcularAreaTriangulo(base, altura));
	                break;
	            case 3:
	                System.out.println("Introduce el lado del cuadrado:");
	                double lado = scanner.nextDouble();
	                System.out.println("El área del cuadrado es: " + calcularAreaCuadrado(lado));
	                break;
	            default:
	                System.out.println("Opción no válida");
	        }
	        
	        scanner.close();
	    }

	    public static double calcularAreaCirculo(double radio) {
	        return Math.PI * Math.pow(radio, 2);
	    }

	    public static double calcularAreaTriangulo(double base, double altura) {
	        return (base * altura) / 2;
	    }

	    public static double calcularAreaCuadrado(double lado) {
	        return lado * lado;
	    }
	
}
