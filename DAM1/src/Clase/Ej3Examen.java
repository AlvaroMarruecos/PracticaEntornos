package Clase;
public class Ej3Examen {

	public static void main(String[] args) {
		int producto = 1;
		
		for (int i = 0; i <=10 ; i++)
			{
			 if(i % 2 != 0)
			producto = producto*i;
			}	
		System.out.println("El producto de los primeros 5 numeros impares es: "+ producto);
	}
}