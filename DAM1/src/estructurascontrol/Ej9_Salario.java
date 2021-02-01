package estructurascontrol;

public class Ej9_Salario {

	public static void main(String[] args)
	{
		arrancarAplicacion

	}

	
	
	
	
	
	
	
	
	
	
	
	
/////////////////////////////////////////////////////////////////////////////
	public static void calcSalario (int emp, double tarifa)
	{
		for (int i=1; i <= emp; i++)
		{
			System.out.println("Empleado " + i);
			int horasTrabajadas =pedirHoras()
			double salBruto
		}
	}
	
	
///////////////////////////////////////////////////////////////////////////////
	public static int pedirHoras ()
	{
		int horas;
		System.out.println("Introduce las horas trabajadas: ");
		
		do
		{
			horas = entrada.nextInt();
			if (horas < 38)
				System.out.println("Las horas tienen que ser 38 o mas");
		}
		while (horas < 38);
		return horas;
	}
/////////////////////////////////////////////////////////////////////////
	public static double calcSalBruto (double tarifa, int horasTrabajadas)
	{
		final double salarioFijo = 38 * tarifa;
		int horasExtra = horasTrabajadas - 38;
		double bruto = (horasExtra *1.5) + salarioFijo;
		return bruto;
	}
//////////////////////////////////////////////////////////////////
	public static double calcImpuestos (double bruto)
	{
		final double
	}
	
	
	
	
	
	
	
	
	
	
	
}
