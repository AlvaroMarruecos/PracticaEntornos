package estructurascontrol;

import java.util.Scanner;

public class Ej19_NotaMedia {

	public static void main(String[] args) {
		/*que visualice en pantalla la nota media de un conjunto de notas.
		 * El usuario deja de introducir notas cuando teclea un -99*/
		
		Scanner entrada=new Scanner(System.in);
		
		double nota=0; //almacena los numeros
		double suma=0; //almacena suma de todos los num
		int elementos=0; //contador de la cantidad de numeros para dividir "suma" luego entre contador
		double media=0;
		final float flag=-99;
		
		//System.out.println("Introduzca las notas numericas. Teclea -99 para terminar");
		//bandera o flag: sirve para interrumpir un proceso (aquí -99).
		
		do {
			System.out.println("Introduce las notas. Teclea -99 para terminar");
			nota=entrada.nextDouble();
			
			if (nota>=0 && nota<=10) {
				suma=suma+nota;
				elementos++;
				media=suma/elementos;
			}
			else if (nota == flag) 
			{
				System.out.println("Fin");
			}
			
			else 
			{
				System.out.println("Esa nota no es correcta");
			}
		}
			
		while (nota != flag);
			System.out.println("Tu nota media final es " + media);

	}

}
