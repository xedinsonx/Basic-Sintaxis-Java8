package prueba;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class If {
	
	public static void main(String [] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num1,num2;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
		
		if(num1 < num2) {
			JOptionPane.showMessageDialog(null, "El primer numero " +num1+ " es mayor"+num2);
		}else if(num1 > num2) {
			JOptionPane.showMessageDialog(null, "El segundo numero es: "+num1+" es menor "+num2);
		}else {
			JOptionPane.showMessageDialog(null, " son iguales igual");
			
		}
		
		
	}

}
