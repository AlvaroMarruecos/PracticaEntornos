package estructurascontrol;

import java.util.Scanner;

public class Ej6_MCD {

	public static void main(String[] args) 
		{
			System.out.println("Dime una numero");
			int num1 = pedirNumero();
			System.out.println("Dime otro numero");
			int num2= pedirNumero();
			int mcd = calcularMCD(num1, num2);
			verResultado(num1, num2, mcd);
		}
		public static int pedirNumero()
		{
			Scanner entrada = new Scanner (System.in);
			int numero = entrada.nextInt();
			return numero;
		}
		
		////////////////////////////////////////////////////////////////////////////////////////
		public static int calcularMCD (int num1, int num2)
		{
			while (num1 != num2)
			{
				if (num1 >num2) {
					num1 = num1 -num2;
				}else
					num2 = num2 - num1;
			}
			return num1;
		}
		public static void verResultado (int num1, int num2, int mcd)
		{
			System.out.println("El MCM de " + num1 + " y " + num2 + " es: " + mcd);
		}
}
