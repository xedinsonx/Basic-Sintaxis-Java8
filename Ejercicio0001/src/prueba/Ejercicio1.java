package prueba;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		
		Scanner nota = new Scanner(System.in);
		
		double nota1,nota2,nota3;
		double notafinal;
		
		
		
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite la primera nota: "));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite la segunda nota: "));
		nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite la tercera nota: "));
		
		notafinal = (nota1+nota2+nota3)/3;
		
		JOptionPane.showMessageDialog(null,"El promedio es: " +notafinal);
		
		
	}

}
