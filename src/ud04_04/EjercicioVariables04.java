package ud04_04;

public class EjercicioVariables04 {

	public static void main(String[] args) {
		int n = 1;

		System.out.println("Valor inicial de N = " + n);
		System.out.println(n + " + 77 = " + (n = n + 77));
		System.out.println(n + " - 3 = " + (n = n - 3));
		System.out.println(n + " * 2 = " + (n = n * 2));
	}
}
