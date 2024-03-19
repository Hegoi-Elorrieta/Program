package Azterketa.Ariketak;

import java.util.Scanner;

class Persona {
    private String nombre;
    private String email;
    private String telefono;

    public Persona(String nombre, String email, String telefono) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    // Getters and setters
    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }
}

class GestorAgenda {
    private Persona[] listaTelefonos;
    private int capacidad;
    private int contador;

    public GestorAgenda(int capacidad) {
        this.capacidad = capacidad;
        listaTelefonos = new Persona[capacidad];
        contador = 0;
    }

    public void añadir(Persona objeto) {
        if (contador < capacidad) {
            listaTelefonos[contador] = objeto;
            contador++;
        } else {
            System.out.println("La lista está llena, no se puede añadir más.");
        }
    }

    public boolean eliminar(String tel) {
        for (int i = 0; i < contador; i++) {
            if (listaTelefonos[i].getTelefono().equals(tel)) {
                // Move elements one position back
                for (int j = i; j < contador - 1; j++) {
                    listaTelefonos[j] = listaTelefonos[j + 1];
                }
                listaTelefonos[contador - 1] = null;
                contador--;
                return true;
            }
        }
        return false;
    }

    public int buscar(String nombre) {
        for (int i = 0; i < contador; i++) {
            if (listaTelefonos[i].getNombre().contains(nombre)) {
                return i;
            }
        }
        return -1;
    }

    public Persona registro(int i) {
        try {
            return listaTelefonos[i];
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Índice fuera de los límites.");
            return null;
        }
    }

    public int longitud() {
        return contador;
    }

    public void mostrarLista() {
        for (int i = 0; i < contador; i++) {
            System.out.println("Nombre: " + listaTelefonos[i].getNombre() + ", Email: " + listaTelefonos[i].getEmail() + ", Teléfono: " + listaTelefonos[i].getTelefono());
        }
    }
}

public class Telefonos {
    public static Scanner scanner = new Scanner(System.in);

    public static int menu() {
        System.out.println("Menú:");
        System.out.println("1. Buscar");
        System.out.println("2. Mostrar agenda");
        System.out.println("3. Añadir");
        System.out.println("4. Eliminar");
        System.out.println("5. Salir");
        System.out.print("Elija una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consume la nueva línea después de nextInt()
        return opcion;
    }

    public static void buscar(GestorAgenda gestorAgenda) {
        System.out.print("Introduce el nombre a buscar: ");
        String nombre = scanner.nextLine();
        int posicion = gestorAgenda.buscar(nombre);
        if (posicion != -1) {
            Persona persona = gestorAgenda.registro(posicion);
            System.out.println("Datos encontrados:");
            System.out.println("Nombre: " + persona.getNombre() + ", Email: " + persona.getEmail() + ", Teléfono: " + persona.getTelefono());
        } else {
            System.out.println("No se encontraron datos para el nombre proporcionado.");
        }
    }

    public static void mostrarAgenda(GestorAgenda gestorAgenda) {
        gestorAgenda.mostrarLista();
    }

    public static void añadir(GestorAgenda gestorAgenda) {
        System.out.print("Introduce el nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Introduce el email: ");
        String email = scanner.nextLine();
        System.out.print("Introduce el teléfono: ");
        String telefono = scanner.nextLine();

        Persona nuevaPersona = new Persona(nombre, email, telefono);
        gestorAgenda.añadir(nuevaPersona);
        System.out.println("Contacto añadido con éxito.");
    }

    public static void eliminar(GestorAgenda gestorAgenda) {
        System.out.print("Introduce el teléfono a eliminar: ");
        String telefono = scanner.nextLine();
        boolean eliminado = gestorAgenda.eliminar(telefono);
        if (eliminado) {
            System.out.println("Contacto eliminado con éxito.");
        } else {
            System.out.println("No se encontró ningún contacto con ese teléfono.");
        }
    }

    public static void main(String[] args) {
        GestorAgenda gestorAgenda = new GestorAgenda(100);

        int opcion;
        do {
            opcion = menu();
            try {
                switch (opcion) {
                    case 1:
                        buscar(gestorAgenda);
                        break;
                    case 2:
                        mostrarAgenda(gestorAgenda);
                        break;
                    case 3:
                        añadir(gestorAgenda);
                        break;
                    case 4:
                        eliminar(gestorAgenda);
                        break;
                    case 5:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (opcion != 5);

        scanner.close();
    }
}
