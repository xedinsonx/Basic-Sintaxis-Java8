package prueba;

import java.util.Scanner;

public class Datos {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		char letra;
		
		System.out.println("Digite una letra: ");
		
		letra= entrada.next().charAt(0);
		
		System.out.println("La cadena es : "+letra);
	}

}
