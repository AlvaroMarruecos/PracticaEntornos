package estructurascontrol;
import java.util.Scanner;
public class Ej2_Examen {

	public static void main(String[] args) {
		
			Scanner entrada = new Scanner(System.in);
			//Variable que controla la salida del bucle
			boolean salir =false;
			//contador de suma de notas
			float sumaPrecio =0;
			int contadorPrecio =0;
			float precio =0;
			//bandera o flag para controlar el fin de un proceso
			final int bandera = 0;
			//pedimos la nota
			System.out.println("Introduce el precio, teclea 0 para salir.");
				
			do 
			{
				precio = entrada.nextFloat();
				
					
				salir = (precio == bandera);
				if (!salir)
				{
					sumaPrecio = sumaPrecio + precio;
					contadorPrecio++;
				}
								
			
					
			}
			while (!salir);
			if (contadorPrecio>0)
			{
				float media = sumaPrecio / contadorPrecio;
				System.out.println("El precio medio es: " + media);
			}
			else
				System.out.println("No ha introducido ninguna precio");
				System.out.println("Fin del programa");
	}

}
