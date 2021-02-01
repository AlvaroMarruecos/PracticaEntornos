package estructurascontrol;

import java.util.Scanner;

public class Ej3_Examen {

	public static  void main(String[] args)
	{
		
		Scanner entrada = new Scanner (System.in);
		
		
		final int pinAlmacenado = 1234;
		int pin;
		boolean pinValido;
		int cont = 3;
		do 
		{
			System.out.println("Introduce el PIN: ");
			//Introducimos el pin
			pin = entrada.nextInt();
			cont--;
			
			if (pin != pinAlmacenado)
			{
			System.out.println("Pin incorrecto, intentos restantes: " + cont);
			}
			
		}	
		while (pin != pinAlmacenado && cont>0);
		
		if (pin == pinAlmacenado)
		{
		System.out.println("Pin correcto");
		}
		else
			System.out.println("Ya no tienes más intentos");
	}		
}

