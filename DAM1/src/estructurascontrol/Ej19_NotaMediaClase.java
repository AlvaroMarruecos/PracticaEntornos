package estructurascontrol;

import java.util.Scanner;

public class Ej19_NotaMediaClase {

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		//Variable que controla la salida del bucle
		boolean salir =false;
		//contador de suma de notas
		float sumaNotas =0;
		int contadorNotas =0;
		float nota =0;
		//bandera o flag para controlar el fin de un proceso
		final int bandera = -99;
		//pedimos la nota
		System.out.println("Introduce la nota, teclea -99 para salir.");
		
		do 
		{
			nota = entrada.nextFloat();
			
			//Comprobamos si se ha introducido un -99
			
			salir = (nota == bandera);
			boolean notaValida = (nota > 0 && nota <=10);
			
			if (!salir && notaValida) 
			{
				sumaNotas = sumaNotas + nota;
				contadorNotas++;
			}
			else if (!salir)
			{
				System.out.println("Error: la nota no es valida");
			}
				
		}
		while (!salir);
		if (contadorNotas>0)
		{
			float media = sumaNotas / contadorNotas;
			System.out.println("La nota media es: " + media);
		}
		else
			System.out.println("No ha introducido ninguna nota");
		System.out.println("Fin del programa");
		
	}

}
