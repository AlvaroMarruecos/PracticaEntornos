package estructurascontrol;

import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ej17_TrianguloAsteriscos {

	public static void main(String[] args) throws IOException {
		
		Scanner entrada = new Scanner(System.in);
		
		for (int i=1; i<=5; i++) {
			System.out.println('*');
			
			for (int j=1; j<=i; j++) 
			{
				System.out.print('*');
			}
		}
		
		
		
		
		}
	}

