package estructurascontrol;
import java.io.IOException;
public class Ej20_CuentaPalabras
{

	public static void main(String[] args) throws IOException
		{
		char cadena;
		boolean salir = false;
		int contador = 0;
		System.out.println("Escriba una flase terminada en punto: ");
		boolean empiezaPalabra = false
		do 
			{
			caracter = (char) System.in.read();
			salir = (caracter == '.');
			if (!empiezaPalabra && caracter != '.' && caracter != '\n' && caracter != )
				empiezaPalabra = true;
			contador++;
			}	
			
			if (caracter == ' ' || caracter == '\n' || caracter == '\t')
			{
			empiezaPalabra = false;
			}	
			
			while(!salir);
			System.out.println("La frase tiene " + contador + "palabras.");
		}
}
