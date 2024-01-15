package prueba;

import java.util.Scanner;

public class Ciclos {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int i=1,contador;
		
		System.out.print("Digite cuantos numeros quiere en la pantalla: ");
		contador = entrada.nextInt();
		
		while(i<=contador) {
			System.out.println(i);
			
			i++;
		}
	}

}
