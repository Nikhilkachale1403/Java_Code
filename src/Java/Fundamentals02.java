package Java;

public class Fundamentals02 {

	static int z = 500;
	static int f = 1000;

	public static void m1() {
		f = 2000;
		System.out.println("local variable: " + f);
		System.out.println("globale variable: " + Fundamentals02.f); // variable with same name.
		System.out.println("static mtd m1 is running");
		System.out.println(z); // utilization of static variable directly in static method with in same class.
	}

	public static void m2(int x, int y) {
		if (x < y) {
			System.out.println(x);
		} else {
			System.out.println(y);
		}
	}

	public static void m3() {
		int a = 100;
		int b = 200;
		if (a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
	}

	public static void main(String[] args) {

		System.out.println("main method");
		m1(); // static method without parameter.
		m2(30, 50); // static method with parameter.
		m3(); // static method with local variable.

	}
}
