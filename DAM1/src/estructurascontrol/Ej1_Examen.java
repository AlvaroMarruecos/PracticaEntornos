package estructurascontrol;

import java.io.IOException;
import java.util.Scanner;

public class Ej1_Examen {

	/*public static void main(String[] args) throws IOException
	{
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un caracter para formar un triángulo");
		char car=(char)System.in.read();

		System.out.println("Introduce un número la altura");
		int altura=entrada.nextInt();
		
		for (int linea=2; linea<altura; linea++) 
		{
		
			for (int ContCa=1; ContCa<=altura; ContCa++) 
			{
				System.out.print(car);
			}
			System.out.println();
		}
	}
}*/

public static void main(String[] args)
{
	for (int j =1; j <=2; j++)
	{
		for (int i = 1; i <= 4; i++)
		{
		System.out.print('$');
		}
		//Saltamos a la siguiente linea
		System.out.println();
	}	
}
}
	
