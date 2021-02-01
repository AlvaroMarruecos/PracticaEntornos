package Clase;
import java.util.Scanner;
public class Ej1Examen {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	
		
				
		System.out.println("Dime el minimo del rango que deseas");
		int nmin = entrada.nextInt();
		System.out.println("Dime el máximo delrango que deseas");
		int nmax = entrada.nextInt();
		System.out.println("Introduce un numero");
		int num = entrada.nextInt();
		if (num >= nmin && num <= nmax)
			System.out.println("El numero elegido esta dentro del rango");
		else 
			System.out.println("ERROR: el numero introducido no esta dentro del rango, intentalo de nuevo.");
		
	}

}
