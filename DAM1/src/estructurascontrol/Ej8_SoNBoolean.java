package estructurascontrol;

import java.io.IOException;

public class Ej8_SoNBoolean {



	public static void main(String args[]) throws IOException 
	{
		boolean respuestaValida;
		char respuesta;
		System.out.println("Introduce la respuesta");
		do {
			respuesta = (char) System.in.read();
			//Limpiamos el buffer del teclado
			System.in.skip(2);
			respuesta = Character.toLowerCase(respuesta);
			//Comprobamos si la respuesta es valida
			respuestaValida = (respuesta == 's'|| respuesta == 'n');
			if(!respuestaValida)
				System.out.println("errror: teclea una s o una n");
			
		}while(!respuestaValida);			
		System.out.println("fin del programa");
	}
}