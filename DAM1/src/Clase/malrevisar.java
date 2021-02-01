package Clase;

import java.util.Scanner;

public class malrevisar {

}
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	int producto =1;
	for (int i=1;i<=10;i++) 
	{
		if (i % 2 != 0);
		producto = producto*i;
		System.out.println(i + " es un numero impar.");
	}
	System.out.println("El producto de los primeros 5 numeros impares es: "+ producto);
}
}
