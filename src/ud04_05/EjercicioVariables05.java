package ud04_05;

public class EjercicioVariables05 {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;

		System.out.println("A=" + a + ", B=" + b + ", C=" + c + ", D=" + d);

		System.out.println("B tome el valor de C: " + (b = c));
		System.out.println("C tome el valor de A: " + (c = a));
		System.out.println("A tome el valor de D: " + (a = d));
		System.out.println("D tome el valor de B: " + (d = b));
	}
}
