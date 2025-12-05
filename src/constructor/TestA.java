package constructor;

public class TestA {

	static int a;
	static int b;
	static int x;
	static int y;
	
	
	TestA(){
		a=10;
		b=20;
	}
	
	TestA(int l, int k){

		x=30;
		y=40;
	}
	public static void main(String[] args) {
	System.out.println(a);
	System.out.println(b);
	
	//new TestA();
	System.out.println(a);
	System.out.println(b);
	
	new TestA(50,60);
	System.out.println(x);
	System.out.println(y);
	}
}
