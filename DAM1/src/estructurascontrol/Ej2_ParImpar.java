package estructurascontrol;

import java.util.Scanner;

/* Introduce por teclado un número entero. Visualizar en pantalla si es par o impar.
*/
public class Ej2_ParImpar 
{

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce un numero: ");
		//Almacenamos el numero en memoria
		int numero = entrada.nextInt();
		//Comprobar si el numero es par o impar
		if(numero % 2 == 0)
			System.out.println( numero + " es par.");
		else 
			System.out.println( numero + " es impar.");
			
	}

}
