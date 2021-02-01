package programacionmodular;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) 
	{
		//Pedimos el numero
		
		int num = pedirNumero();
		//Calculamos el factorial
		int factorial = calcularFactorial(num);
		// Enviamos a pantalla los resultados
		verResultados(num, factorial);
			
		

	}
	/////////////////////////////////////
	public static int pedirNumero()
	{
		System.out.println("Introduce el numero");
		Scanner entrada = new Scanner (System.in);		
		
		return entrada.nextInt();
		
	}
/////////////////////////////////////
	public static int calcularFactorial(int num)
	{
		//Acumulador
		int factorial = 1;
		for(int i = num; i >=1; i--)
			factorial = factorial * i;
			
		return factorial;	
	}
	////////////////////////////////
	public static void verResultados(int num, int factorial)
	{
		System.out.println("El factorial de " + num + " es " + factorial);
	}
	
	
	
}
