package ud04_02;

public class EjercicioVariables02 {

	public static void main(String[] args) {
		int n = 5;
		double a = 4.56;
		char c = 'a';

		System.out.println("Variable N = " + n);
		System.out.println("Variable A = " + a);
		System.out.println("Varaible C = " + c);
		System.out.println(n + " + " + a + " = " + (n + a));
		System.out.println(a + " - " + n + " = " + (a - n));

		// Hacemos un casting de 'c' para que muestre el valor entero
		System.out.println("El valor numérico del cáracter a = " + (int) c);

	}
}
