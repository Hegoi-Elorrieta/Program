package Repaso_Ariketak.Objetos;

import java.util.Scanner;

public class Ariketa_7 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingrese la cantidad de euros:");
	        double euros = scanner.nextDouble();

	        System.out.println("Ingrese la moneda a la que desea convertir (dolares, yenes, libras):");
	        String monedaDestino = scanner.next();

	        convertirMoneda(euros, monedaDestino);

	        scanner.close();
	    }

	    public static void convertirMoneda(double euros, String monedaDestino) {
	        double cambio = 0;

	        switch (monedaDestino.toLowerCase()) {
	            case "dolares":
	                cambio = euros * 1.28611;
	                System.out.println(euros + " euros son " + cambio + " dólares.");
	                break;
	            case "yenes":
	                cambio = euros * 129.852;
	                System.out.println(euros + " euros son " + cambio + " yenes.");
	                break;
	            case "libras":
	                cambio = euros * 0.86;
	                System.out.println(euros + " euros son " + cambio + " libras.");
	                break;
	            default:
	                System.out.println("Moneda no válida. Las opciones son: dolares, yenes, libras.");
	        }
	    }
}
