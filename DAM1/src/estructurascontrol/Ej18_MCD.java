package estructurascontrol;

import java.util.Scanner;

public class Ej18_MCD {

	public static void main(String[] args) 
	{
		Scanner entrada =new Scanner(System.in);
		//introducimos por teclado los numeros
		System.out.println("Introduzca el numero 1");
		int num1 = entrada.nextInt();
		System.out.println("Introduzca el numero 2");
		int num2 = entrada.nextInt();
		while (num1 != num2)
		{
			if (num1 >num2)
				num1 = num1 -num2;
			else
				num2 = num2 - num1;
		}
		System.out.println("El MCD es " +num1);
	}

}
