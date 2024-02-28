package Ariketa_01;

import java.util.Scanner;

public class Taxi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Taxi_Test taxi = new Taxi_Test();
		Scanner sc = new Scanner(System.in);
		String katea = "";
		
		System.out.println("Zein da taxiaren probintzia?");
		katea = sc.nextLine();
		taxi.setProbintzia(katea);
		
		System.out.println("Zein da taxiaren matrikula?");
		katea = sc.nextLine();
		taxi.setMatrikula(katea);
		
		System.out.println("Zein udalerrian dago taxi-a?");
		katea = sc.nextLine();
		taxi.setUdalerria(katea);
		
		System.out.println("Zein motor mota du taxi-a?");
		System.out.println("0. Ezaguna");
		System.out.println("1. Diesel");
		System.out.println("2. Gasolina");
		katea = sc.nextLine();
		int aukera = Integer.parseInt(katea);
		
		if (aukera == 0) {
			taxi.setMotorMota("Ezaguna");
		} else if (aukera == 1) {
			taxi.setMotorMota("Diesel");
		} else {
			taxi.setMotorMota("Gasolina");
		}
		
		System.out.println(taxi.getProbintzia());
		System.out.println(taxi.getMatrikula());
		System.out.println(taxi.getUdalerria());
		System.out.println(taxi.getMotorMota());
		
		sc.close();
		
	}

}
