package Clase;

import java.util.Scanner;

public class Ej2Examen {

	public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
		
			
					
			System.out.println("Dime el minimo del rango que deseas");
			int nmin = entrada.nextInt();
			System.out.println("Dime el máximo delrango que deseas");
			int nmax = entrada.nextInt();
			
			boolean rangoValido;
			System.out.println("Introduce un numero");
			int num = entrada.nextInt();
			do {
				rangoValido = (num >= nmin && num <= nmax);
				if (!rangoValido);
					System.out.println("ERROR: el numero introducido no esta dentro del rango, intentalo de nuevo.");
			
				}
			while (!rangoValido) ;
			System.out.println("El numero elegido esta dentro del rango");
			
		}

	}

