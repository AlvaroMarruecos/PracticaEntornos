package estructurascontrol;

import java.io.IOException;

public class Ej5 {
	public static void main(String[] args) throws IOException 
	{
		
		System.out.println("Introduce una frase y pulsa enter para terminar.");
		
		char car =(char)System.in.read();
		
		while (car!= '\n')
		{
			System.out.print(car);
			car =(char)System.in.read();
		}
		
	}
}
	
	
	
