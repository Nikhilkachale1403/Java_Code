package constructor;

public class TestB {

	TestB(int x){
		System.out.println("Start Cunstrt");
		System.out.println("Value of x :" +x);
		System.out.println("End Constr");
	}
	TestB(){
		this(30);
		System.out.println("Cstr without arg is running");
		System.out.println();
	}
	public void m1(int x) {
		System.out.println("m1 is running");
	}
	public static void main(String[] args) {
	//new TestB();
	TestB T = new TestB();
	T.m1(0);
	}
}
