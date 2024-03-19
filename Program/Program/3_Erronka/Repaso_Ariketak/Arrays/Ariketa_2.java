package Repaso_Ariketak.Arrays;

public class Ariketa_2 {

	    public static void main(String[] args) {
	        // Definir arrays para los sueldos de los empleados en cada turno
	        int[] turnoMan = {1200, 1300, 1400, 1500};
	        int[] turnoTar = {1200, 1300, 1400, 1500};

	        // Calcular los gastos en sueldos de cada turno
	        int gastosTurnoMan = calcularGastos(turnoMan);
	        int gastosTurnoTar = calcularGastos(turnoTar);

	        // Imprimir los gastos en sueldos de cada turno
	        System.out.println("Gastos en sueldos del turno de la mañana: $" + gastosTurnoMan);
	        System.out.println("Gastos en sueldos del turno de la tarde: $" + gastosTurnoTar);
	    }

	    // Método para calcular los gastos en sueldos de un turno
	    public static int calcularGastos(int[] sueldos) {
	        int total = 0;
	        for (int sueldo : sueldos) {
	            total += sueldo;
	        }
	        return total;
	    }
}
