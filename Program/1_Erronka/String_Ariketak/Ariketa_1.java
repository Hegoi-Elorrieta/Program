package String_Ariketak;

public class Ariketa_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String texto = "Aqui se dice cual es la longitud del texto";

		int cop = texto.length();
		System.out.println(cop);
		
		char siete = texto.charAt(6);
		System.out.println("Esta es la letra 7 del texto: " + siete);
		
		int x = texto.indexOf("x");
		
		if (x > 0) {
			System.out.println(texto.indexOf("x"));
		} else {
			System.out.println("No se a encontrado ese caracter.");
		}
		System.out.println(texto.toUpperCase());
	}

}
