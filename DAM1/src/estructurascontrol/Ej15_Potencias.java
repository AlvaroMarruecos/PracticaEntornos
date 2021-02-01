package estructurascontrol;

import java.util.Scanner;

public class Ej15_Potencias
{

	public static void main(String[] args)
	{
		Scanner entrada =new Scanner(System.in);		
	
		System.out.println("Introduce un numero: ");
		int numero=entrada.nextInt();
		
		int factorial=1;
		
		for (int cont=numero; cont>0; cont--)
			factorial = factorial * cont;
		System.out.println("El factorial de " + numero + " = " + factorial);
	}
}