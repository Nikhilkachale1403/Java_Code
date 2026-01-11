package Java;

public class Fundamentals03 {

	static int a = 200;
	int c = 300;

	int x;
	static int y;

	int p = 360;
	static int q = 960;

	public void m4() {

		int k = this.p;
		int l = Fundamentals03.q;
		System.out.println(k); // transforming global variable value to local variable value.
		System.out.println(l);

		int z = 5000;
		this.x = z;
		Fundamentals03.y = z;
		System.out.println(x); // transforming local variable value to global variable value.
		System.out.println(y);

		int b = 100;
		int c = 400;
		System.out.println(this.c); // same name of instance variable on global and local: to call global variable
									// use this keyword.

		System.out.println(b); // use of instance variable inside non static method.
		System.out.println(a); // use of static variable inside non static method.
		System.out.println("m4 mtd running");
	}

	public static void main(String[] args) {

		Fundamentals03 f = new Fundamentals03();
		f.m4(); // need object ref to call non static method.
	}
}
