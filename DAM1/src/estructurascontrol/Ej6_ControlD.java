package estructurascontrol;

import java.io.IOException;

public class Ej6_ControlD {
	public static void main(String[] args) throws IOException 
	{
		final char EOF = (char)-1;
		System.out.println(EOF);
		System.out.println("introduce una frase (ControlD para terminar) ");
		char car =(char)System.in.read();
		
		while (car!= EOF)
		{
			System.out.print(car);
			car =(char)System.in.read();
		}
	}
}
	
