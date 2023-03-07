package ud04_03;

public class EjercicioVariables03 {

	public static void main(String[] args) {
		int x = 10;
		int y = 2;
		double n = 10.5;
		double m = 2.5;

		//Utilizamos tres variables para las operaciones de los últimos tres resultados
		double dobleTodasVariables = (x * 2) + (y * 2) + (n * 2) + (m * 2);
		double sumaTodasVariables = x + y + n + m;
		double productoTodasVariables = x * y * n * m;

		System.out.println("La suma " + x + " + " + y + " = " + (x + y));
		System.out.println("La diferencia " + x + " - " + y + " = " + (x - y));
		System.out.println("El producto " + x + " * " + y + " = " + (x * y));
		System.out.println("El cociente " + x + " / " + y + " = " + (x / y));
		System.out.println("El resto " + x + " % " + y + " = " + (x % y));
		System.out.println("La suma " + n + " + " + m + " =" + (n + m));
		System.out.println("La diferencia " + n + " - " + m + " = " + (n - m));
		System.out.println("El producto " + n + " * " + m + " = " + (n * m));
		System.out.println("El cociente " + n + " / " + m + "  = " + (n / m));
		System.out.println("El resto " + n + " % " + m + "  = " + (n % m));
		System.out.println("La suma " + x + " + " + n + " =" + (x + n));
		System.out.println("El cociente " + y + " / " + m + " = " + (y / m));
		System.out.println("El resto " + y + " % " + m + " = " + (y % m));
		
		//Últimos tres resultados
		System.out.println("El doble de cada varaible =" + dobleTodasVariables);
		System.out.println("La suma de todas las variables = " + sumaTodasVariables);
		System.out.println("El producto de todas las varaibles = " + productoTodasVariables);
	}
}
