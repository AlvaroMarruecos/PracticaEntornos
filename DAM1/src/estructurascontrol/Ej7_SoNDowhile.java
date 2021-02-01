package estructurascontrol;

import java.io.IOException;

public class Ej7_SoNDowhile {

	public static void main(String args[]) throws IOException 
	{
		char respuesta;
		System.out.println("Introduce la respuesta");
		do {
			respuesta = (char) System.in.read();
			respuesta = Character.toLowerCase(respuesta);
			//Limpiamos el buffer del teclado
			System.in.skip(2);
			if (respuesta !='s' && respuesta !='n')
				System.out.println("errror: teclea una s o una n");
			
		}while (respuesta != 's' && respuesta != 'n');			
		System.out.println("fin del programa");
	}
}