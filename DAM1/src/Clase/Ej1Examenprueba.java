package Clase;
import java.util.Scanner;
public class Ej1Examenprueba {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	
		
				
		System.out.println("Dime el minimo del rango que deseas");
		int nmin = entrada.nextInt();
		System.out.println("Dime el máximo delrango que deseas");
		int nmax = entrada.nextInt();
		int m;
		System.out.println("Introduce un numero");
		int num = entrada.nextInt();
		
		
		do
		{
			System.out.println("Introduce un numero");
			int num = entrada.nextInt();
			if (num >= nmin && num <= nmax)
			System.out.println("El numero elegido esta dentro del rango");
		}
		while 
			System.out.println("ERROR: el numero introducido no esta dentro del rango, intentalo de nuevo.");
		
		
		
		
		int n;
		do 
		{
			System.out.println("Introduce un numero");
			int num = entrada.nextInt();
			if (num >= nmin && num <= nmax)
				System.out.println("El numero elegido esta dentro del rango");
		}
		while (num <= nmin && num >= nmax);
		return n;
	}
	
	
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
	

}