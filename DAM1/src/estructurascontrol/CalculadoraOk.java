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
						// Imprimimos en pantalla el menú de opciones.
						System.out.println("");
						System.out.println("MENÚ DE OPCIONES:");
						System.out.println("1 - Suma. ");
						System.out.println("2 - Resta. ");
						System.out.println("3 - Producto. ");
						System.out.println("4 - División. ");
						System.out.println("5 - Salir. ");
						// Introducimos la opción y la validamos.
						Scanner entrada = new Scanner (System.in);
						boolean opcionValida;
						do {
							// Introducimos la opción.
							opcion = entrada.nextInt();
							
							//Comprobamos si la opción es válida.
							opcionValida = (opcion >= 1 && opcion <= 5);
							if (!opcionValida)
								System.out.println("Error: tecle una opcion entre 1 y 5");
						   }
						while(!opcionValida);
						//Comprobamos si la opción elegida es igual a 5.
						salir = (opcion == 5);
						if (!salir)
						{
							// Pedimos los números.
							System.out.println("Introduce el número 1: ");
							num1 = entrada.nextDouble();
							System.out.println("Introduce el número 2: ");
							num2 = entrada.nextDouble();
							while(opcion == 4 && num2 == 0)
							{
								System.out.println("El segundo número no puede ser 0, vuelve a introducir un número.");
								num2 = entrada.nextInt();
							}
							
							//Comprobamos el tipo de operación a realizar.
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
					System.out.println("Fin de la aplicación");
	}

}
