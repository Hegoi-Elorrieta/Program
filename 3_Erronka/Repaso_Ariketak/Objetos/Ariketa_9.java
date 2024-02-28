package Repaso_Ariketak.Objetos;

import java.util.Scanner;

public class Ariketa_9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar nombre del cliente
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();

        // Solicitar número de productos
        System.out.print("Ingrese el número de productos: ");
        int numProductos = scanner.nextInt();

        double total = 0;

        // Solicitar detalles de cada producto y calcular el total
        for (int i = 1; i <= numProductos; i++) {
            scanner.nextLine(); // Limpiar el buffer
            System.out.println("Producto " + i + ":");
            System.out.print("Nombre: ");
            String nombreProducto = scanner.nextLine();
            System.out.print("Precio: ");
            double precioProducto = scanner.nextDouble();
            System.out.print("Cantidad: ");
            int cantidadProducto = scanner.nextInt();

            total += precioProducto * cantidadProducto;
        }

        // Aplicar descuento si el total supera los $1000 en las áreas mencionadas
        double descuento = 0;
        if (total > 1000) {
            descuento = total * 0.20;
        }

        double totalAPagar = total - descuento;

        // Mostrar el resumen de la compra
        System.out.println("\nResumen de la compra:");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Total: $" + total);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + totalAPagar);

        scanner.close();
    }
}
