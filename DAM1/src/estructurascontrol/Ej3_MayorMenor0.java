package estructurascontrol;

import java.util.Scanner;

/* Introduce por teclado un número entero. Visualizar por pantalla si es 0, mayor que 0 o menor
que 0.
*/
public class Ej3_MayorMenor0 
{

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce un numero: ");
		//Almacenamos el numero en memoria
		int numero = entrada.nextInt();
		//Comprobar si el numero es par o impar
		if(numero > 0)
			System.out.println( numero + " es mayor que 0.");
		else if(numero <0)
			System.out.println( numero + " es menor que 0.");
			
	}

}