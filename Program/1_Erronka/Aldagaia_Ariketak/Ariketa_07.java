package Aldagaia_Ariketak;

public class Ariketa_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Valor de "a" es 3 y valor de "b" es 3
		int a = 1;
		int b = 3;
				
		System.out.println("A:" + a);
		System.out.println("B:" + b);
				
		//El valor "aux" es igual a "a", el valor"a" es igual a "b" y el valor "b" es igual a "aux"
		int aux= a;
		a = b;
		b = aux;
				
		System.out.println("A:" + a);
		System.out.println("B:" + aux);
	}

}
