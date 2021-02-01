package estructurascontrol;
import java.util.Scanner;
public class Ej4_Potencia {

	public static void main(String[] args)
	{
		System.out.println("Dime una base");
		int base = pedirNumero();
		System.out.println("Dime un exponente");
		int exp= pedirNumero();
		int calc = calcularPotencia(base, exp);
		verResultado(base,exp,calc);
	}
	public static int pedirNumero()
	{
		Scanner entrada = new Scanner (System.in);
		return entrada.nextInt();
	}
	
	public static int calcularPotencia (int base, int exp)
	{
		int resultado = 1;
		for (int i=0; i<= exp; i++)
			resultado = resultado * base;
		return resultado;
	}
	public static void verResultado (int base, int exp, int calc)
	{
		System.out.println(base + " elevado a " + exp + " es igual a " + calc);
	}
}