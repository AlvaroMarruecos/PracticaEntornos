package estructurascontrol;

public class Ej10_ForSumayProducto 
{
	public static void main(String[] args) 
	{
		//Inicializamos los acumuladores
		int producto = 1;
		
		for (int i = 1; i <=10 ; i++)
			//Hacemos la suma y el producto
			{
			 if(i % 2 != 0)
			producto = producto*i;
			}	
		//Imprimir resultados
		System.out.println("El resultado de la multiplicación es: " + producto);
	}
}
