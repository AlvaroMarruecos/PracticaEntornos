package estructurascontrol;
import java.util.Scanner;
public class Ej_Combinaciones {

	public static void main(String[] args) 
	{
		int m = pedirM();
		int n = pedirN(m);
		int resultado = combinaciones(n,m);
		verResultado (m,n,resultado);
	}
////////////////////////////////////////////////////////////
	public static int pedirM() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca M");
		//Introducimos m y lo validamos
		int m;
		do {
			m = entrada.nextInt();
			if (m < 0) 
			{
				System.out.println("errror: m tiene que ser mayor o igual que 0");
			}
		}while (m < 0);
		return m; 
	}
////////////////////////////////////////////////////////////
	public static int pedirN(int m) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Intruduzca N");
		int n;
		do 
		{
			n = entrada.nextInt();
			if (n < 0 || n > m)
			{
				System.out.println("ERROR: N tiene que ser mayor o igual que 0 y menor o igual que M");
			}
		}
		while (n < 0 || n > m);
		return n;
	}
////////////////////////////////////////////////////////////
	public static int combinaciones(int n , int m ) 
	{
		return factorial(m)/ factorial(n)*factorial(m-n);
	}
///////////////////////////////////////////////////
	public static int factorial (int numero)
	{
		int factorial = 1;
		for (int i=1; i<= numero; i++)
			factorial =factorial * i;
		return factorial;
	}
////////////////////////////////////////////////////////////
	public static void verResultado (int n, int m, int resultado) 
	{
		System.out.println("Las combinaciones de " + m + " sobre " + n + " son " + resultado);
	}	
}
