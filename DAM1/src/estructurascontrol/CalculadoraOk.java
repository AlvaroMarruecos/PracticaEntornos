package estructurascontrol;

import java.util.Scanner;
public class CalculadoraOk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Introducimos las variables.
				double num1;
				double num2;
				double resultado = 0;
				int opcion;
				boolean salir;
				
				do {
						// Imprimimos en pantalla el men� de opciones.
						System.out.println("");
						System.out.println("MEN� DE OPCIONES:");
						System.out.println("1 - Suma. ");
						System.out.println("2 - Resta. ");
						System.out.println("3 - Producto. ");
						System.out.println("4 - Divisi�n. ");
						System.out.println("5 - Salir. ");
						// Introducimos la opci�n y la validamos.
						Scanner entrada = new Scanner (System.in);
						boolean opcionValida;
						do {
							// Introducimos la opci�n.
							opcion = entrada.nextInt();
							
							//Comprobamos si la opci�n es v�lida.
							opcionValida = (opcion >= 1 && opcion <= 5);
							if (!opcionValida)
								System.out.println("Error: tecle una opcion entre 1 y 5");
						   }
						while(!opcionValida);
						//Comprobamos si la opci�n elegida es igual a 5.
						salir = (opcion == 5);
						if (!salir)
						{
							// Pedimos los n�meros.
							System.out.println("Introduce el n�mero 1: ");
							num1 = entrada.nextDouble();
							System.out.println("Introduce el n�mero 2: ");
							num2 = entrada.nextDouble();
							while(opcion == 4 && num2 == 0)
							{
								System.out.println("El segundo n�mero no puede ser 0, vuelve a introducir un n�mero.");
								num2 = entrada.nextInt();
							}
							
							//Comprobamos el tipo de operaci�n a realizar.
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
									resultado = num1 / num2;
									break;
							}// Fin Switch.		
							//Imprimimos en pantalla el resultado.
							System.out.println("Resultado es igual a: " + resultado);		
						} // Fin de if.	
				}while (!salir);
					System.out.println("Fin de la aplicaci�n");
	}

}
