package estructurascontrol;
import java.util.Scanner;
public class Ej14_Calculadora 
{
	public static void main(String[] args) 
	{
		// Variables
		double num1;
		double num2;
		double resultado =0;
		int opcion;
		boolean salir;
		do 
		{
			// Imprimimos en pantalla el menu
			System.out.println("OPERACIONES");
			System.out.println("1-Suma");
			System.out.println("2-Resta");
			System.out.println("3-Multiplicacion");
			System.out.println("4-Division");
			System.out.println("5-Salir de la aplicacion");
			// Introducimos la opcion y la validamos
			Scanner entrada = new Scanner (System.in);
			boolean opcionValida;
			do 
			{
				//Introducimos la opcion
				opcion = entrada.nextInt();
				//Comprobamos si la opcion es valida
				opcionValida = (opcion >= 1 && opcion <= 5);
				if (!opcionValida)
					System.out.println("Error: tecle una opcion entre 1 y 5");
			}while(!opcionValida);
			//Comprobamos si ha tecleado la opcion de salir (5)
			salir = (opcion == 5);
			System.out.println("Fin de la aplicacion");
			if (!salir) 
			{
				//Pedimos los numeros por teclado
				System.out.println("Introduzca numero 1");
				num1 = entrada.nextDouble();
				System.out.println("Introduzca numero 2");
				num2 = entrada.nextDouble();
				while (opcion == 4 && num2 == 0)
				{
					System.out.println("El segundo numero no puede ser un 0, vuelve a introducir un numero");
					num2 = entrada.nextInt();
				}
				//Comprobamos el tipo de operacion a realizar
				switch (opcion) 
				{
				case 1: 
					resultado = num1 + num2;
					break;
				case 2: 
					resultado = num1 - num2;
					break;
				case 3: 
					resultado = num1 * num2;
					break;
				case 4: 
					//Si el divisor es 0 sacamos un mensaje de error, en caso contrario hacemos la division
					if(num2 != 0)
						resultado = num1 / num2;
					else
						System.out.println("Error, no se puede dividir entre 0");
					break;
				}//Fin switch
				//Imprimimos en pantalla el resultado
					System.out.println("El resultado es igual a: " + resultado);
			}//Fin del if
		} while (!salir);
	}
}
