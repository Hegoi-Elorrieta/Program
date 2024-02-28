package Azterketa.Ariketak;

import java.util.ArrayList;
import java.util.Scanner;

	class coche {
		
		private String marca;
		private String color;
		private String año;
		
		public coche(String marca, String color, String año) {
			this.marca = marca;
			this.color = color;
			this.año = año;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String getAño() {
			return año;
		}

		public void setAño(String año) {
			this.año = año;
		}
}	
		class cocheLista {
			
			private ArrayList<coche> listacoche;
			
			public cocheLista() {
				listacoche = new ArrayList<>(100);
			}
			
			public void añadir(coche objeto) {
				listacoche.add(objeto);
			}
			
			public boolean eliminar(String año) {
				for (coche coche : listacoche) {
					if (coche.getAño().equals(año)) {
						listacoche.remove(coche);
						return true;
					}
				}
				return false;
			}
			
			public int buscar(String marca) {
				for (int i = 0; 1 < listacoche.size(); i++) {
					if(listacoche.get(i).getMarca().contains(marca)) {
						return i;
					}
				}
				return -1;
			}
			
			public coche registro(int i) {
				try {
					return listacoche.get(i);
				} catch (IndexOutOfBoundsException e) {
					System.out.println("Fuera de los limites");
					return null;
				}
			}
			
			public int longitud() {
				return listacoche.size();			
				}
			
			public void mostrarLista() {
				for (coche coche : listacoche) {
					System.out.println("Marca: " + coche.getMarca() + "Color: " + coche.getColor() + "Año: " + coche.getAño());
				}
			
			}	
		}
		
		public class Telefonos {
			public static Scanner teclado = new Scanner(System.in);
			
			public static int menu() {
				System.out.println("Menu:");
				System.out.println("1. Buscar");
				System.out.println("2. Mostrar lista");
				System.out.println("3. Añadir");
				System.out.println("4. Eliminar");
				System.out.println("5. Salir");
				
				int opcion = teclado.nextInt();
				teclado.nextLine();
				return opcion;
		}
			
			public static void buscar(cocheLista cocheLista) {
				System.out.println("Introduce la marca a buscar: ");
				String marca = teclado.nextLine();
				int posicion = cocheLista.buscar(marca);
				if (posicion != -1) {
					coche coche = cocheLista.registro(posicion);
					System.out.println("Datos encontrados:");
					System.out.println("Nombre: " + coche.getMarca() + ", Color: " + coche.getColor() + ", Año: " + coche.getAño());	
				} else {
					System.out.println("No se encontraron datos para el nombre proporcionado");
				}
			}
			
			public static void mostrarLista(cocheLista cocheLista) {
				cocheLista.mostrarLista();
			}
			
			public static void añadir(cocheLista cocheLista) {
				System.out.println("Introduce la marca: ");
				String marca = teclado.nextLine();
				System.out.println("Introduce el color: ");
				String color = teclado.nextLine();
				System.out.println("intrduce el año: ");
				String año = teclado.nextLine();
				
				coche coche2 = new coche(marca, color, año);
				cocheLista.añadir(coche2);
				System.out.println("Coche añadido con exito.");
			}
			
			public static void eliminar(cocheLista cocheLista) {
				System.out.println("Introduce la marca a eliminar: ");
				String marca = teclado.nextLine();
				boolean eliminado = cocheLista.eliminar(marca);
				if (eliminado) {
					System.out.println("Coche eliminado con exito.");
				} else {
					System.out.println("No se encontro ningun coche con esa marca");
				}
			}
			
			public static void main(String[] args) {
				cocheLista cocheLista = new cocheLista();
				
				int opcion;
				do {
					opcion = menu();
					try {
						switch (opcion) {
						case 1:
							buscar(cocheLista);
							break;
						case 2:
							mostrarLista(cocheLista);
							break;
						case 3:
							añadir(cocheLista);
							break;
						case 4:
							eliminar(cocheLista);
							break;
						case 5:
							System.out.println("Saliendo...");
							break;
						default:
							System.out.println("Opcion no valida.");
						}
					} catch (Exception e) {
						System.out.println("Error: " + e.getMessage());
					}
				} while (opcion != 5);
				
				teclado.close();
	}			
}