package Clase;

import java.util.Scanner;

public class prueba {

	public static void main(String[] args) {
		
			Scanner entrada = new Scanner(System.in);
			System.out.println("Dime el minimo del rango que deseas");
			int nmin = entrada.nextInt();
			System.out.println("Dime el máximo delrango que deseas");
			int nmax = entrada.nextInt();
		
			System.out.println("Introduce un numero");
			int num = entrada.nextInt();
			boolean rangoValido;
			System.out.println("Introduce la respuesta");
			do {
				
				rangoValido = (num >= nmin && num <= nmax);
				if(!rangoValido)
					System.out.println("errror: teclea una s o una n");
				
			}while(!rangoValido);			
			System.out.println("fin del programa");
		}
	}