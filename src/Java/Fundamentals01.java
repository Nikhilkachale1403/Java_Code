package Java;

public class Fundamentals01 {

	static int a = 100; //Global variable - non static.
	int b = 200; //Global variable - non static.

	public static void main(String[] args) {

		Fundamentals01 f = new Fundamentals01(); //object for global variable
		System.out.println(Fundamentals01.a); //local variable can call with ref. of class name.
		int c = 20; //Local Variable
		System.out.println(c);
		a = 40; //value of static global variable can change.
		System.out.println(a); //Local variable can call with name of variable.
		System.out.println(f.b); //utilization of global variable with ref. to object.

	}
}
