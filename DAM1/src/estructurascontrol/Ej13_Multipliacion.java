package estructurascontrol;

import java.util.Scanner;

public class Ej13_Multipliacion 
{
	public static void main(String[] args) 
	{

		Scanner entrada=new Scanner(System.in);
		int num;
		System.out.println("Introduce un numero entre 1 y 10");
		num=entrada.nextInt();
		
		System.out.println("La tabla de multiplicar del " + num );
		for (int i=1; i<=10; i++)
		{
			System.out.println(num + "*" + i + " = " +num*i);
		}
	}
}
