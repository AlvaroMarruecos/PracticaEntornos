package estructurascontrol;
import java.io.IOException;
import java.util.Scanner;

public class Ej17_TrianguloCaracter
{
	public static void main(String[] args) throws IOException
	{
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un caracter para formar un triángulo");
		char car=(char)System.in.read();

		System.out.println("Introduce un número la altura");
		int altura=entrada.nextInt();
		
		for (int linea=1; linea<=altura; linea++) 
		{
		
			for (int ContCa=1; ContCa<=linea; ContCa++) 
			{
				System.out.print(car);
			}
			System.out.println();
		}
	}
}
