package constructor;

public class TestC {

	int a=20;
	int b=30;
	
	TestC (){
		a=40;
		b=50;
		
	}
	public static void main(String[] args) {

		TestC t = new TestC();
		//Step01: Object creation - Copy
		//Step02: non static element declaration - t.a=20, t.b=30
		//Step03: Constructor Execution t.a=40, t.b=50
		
		System.out.println(t.a);
		System.out.println(t.b);
		
		
	}

}
