package estructurascontrol;
import java.util.Scanner;

/* (ConversorNotas.java) que convierta las calificaciones alfabéticas I,F,B, N y S en calificaciones numéricas 4, 5, 6, 7 y
9 respectivamente.
*/
public class Ej4_ConversorNotas 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce una calificacion: ");
		char calificacion = entrada.next().charAt(0);
		//Almacenamos la calificacion en memoria
		{
			switch (calificacion)
			{
				case 'I': System.out.print( "I es 4"); 
				break;
				case 'F': System.out.print("F es 5"); 
				break;
				case 'B': System.out.print(" B es 6"); 
				break;
				case 'N': System.out.print(" N es 7");
				break;
				case 'S': System.out.print(" S es 9"); 
				break;
				default: System.out.print("Error");
			}
		}
		 
	}
}
