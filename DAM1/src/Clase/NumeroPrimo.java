package programacionmodular;

import java.util.Scanner;

public class NumeroPrimo {
	
	

	public static void main(String[] args) 
	{
		int num = pedirNumEntero();
		if(esPrimo(num))
			System.out.println(num + " es primo");
		else 
			System.out.println(num + " no "
					+ "es primo");

	}
	///////////////////////////////////
	public static int pedirNumEntero()
	{
		Scanner entrada = new Scanner(System.in);
		System.out.println("introduce un número entero:");
		return entrada.nextInt();
	}
/////////////////////////////////
	public static boolean esPrimo(int num)
	{
		for( int divisor = 2; divisor <= num/2; divisor++ )
		{
			//comprobamos si el resto es 0
			if(num % divisor == 0)
				return false;	
			
		}
		return true;	 
		
	}

}
