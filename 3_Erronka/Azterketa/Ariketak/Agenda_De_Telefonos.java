package Azterketa.Ariketak;

import java.util.ArrayList;
import java.util.Scanner;

class CPersona {
    private String nombre;
    private String email;
    private String telefono;

    public CPersona(String nombre, String email, String telefono) {
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

class CListaTfnos {
    private ArrayList<CPersona> listaTelefonos;

    public CListaTfnos() {
        listaTelefonos = new ArrayList<>(100);
    }

    public void añadir(CPersona objeto) {
        listaTelefonos.add(objeto);
    }

    public boolean eliminar(String tel) {
        for (CPersona persona : listaTelefonos) {
            if (persona.getTelefono().equals(tel)) {
                listaTelefonos.remove(persona);
                return true;
            }
        }
        return false;
    }

    public int buscar(String nombre) {
        for (int i = 0; i < listaTelefonos.size(); i++) {
            if (listaTelefonos.get(i).getNombre().contains(nombre)) {
                return i;
            }
        }
        return -1;
    }

    public CPersona registro(int i) {
        try {
            return listaTelefonos.get(i);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Índice fuera de los límites.");
            return null;
        }
    }

    public int longitud() {
        return listaTelefonos.size();
    }

    public void mostrarLista() {
        for (CPersona persona : listaTelefonos) {
            System.out.println("Nombre: " + persona.getNombre() + ", Email: " + persona.getEmail() + ", Teléfono: " + persona.getTelefono());
        }
    }
}

public class Agenda_De_Telefonos {
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

    public static void buscar(CListaTfnos listaTfnos) {
        System.out.print("Introduce el nombre a buscar: ");
        String nombre = scanner.nextLine();
        int posicion = listaTfnos.buscar(nombre);
        if (posicion != -1) {
            CPersona persona = listaTfnos.registro(posicion);
            System.out.println("Datos encontrados:");
            System.out.println("Nombre: " + persona.getNombre() + ", Email: " + persona.getEmail() + ", Teléfono: " + persona.getTelefono());
        } else {
            System.out.println("No se encontraron datos para el nombre proporcionado.");
        }
    }

    public static void mostrarAgenda(CListaTfnos listaTfnos) {
        listaTfnos.mostrarLista();
    }

    public static void añadir(CListaTfnos listaTfnos) {
        System.out.print("Introduce el nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Introduce el email: ");
        String email = scanner.nextLine();
        System.out.print("Introduce el teléfono: ");
        String telefono = scanner.nextLine();

        CPersona nuevaPersona = new CPersona(nombre, email, telefono);
        listaTfnos.añadir(nuevaPersona);
        System.out.println("Contacto añadido con éxito.");
    }

    public static void eliminar(CListaTfnos listaTfnos) {
        System.out.print("Introduce el teléfono a eliminar: ");
        String telefono = scanner.nextLine();
        boolean eliminado = listaTfnos.eliminar(telefono);
        if (eliminado) {
            System.out.println("Contacto eliminado con éxito.");
        } else {
            System.out.println("No se encontró ningún contacto con ese teléfono.");
        }
    }

    public static void main(String[] args) {
        CListaTfnos listaTfnos = new CListaTfnos();

        int opcion;
        do {
            opcion = menu();
            try {
                switch (opcion) {
                    case 1:
                        buscar(listaTfnos);
                        break;
                    case 2:
                        mostrarAgenda(listaTfnos);
                        break;
                    case 3:
                        añadir(listaTfnos);
                        break;
                    case 4:
                        eliminar(listaTfnos);
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
