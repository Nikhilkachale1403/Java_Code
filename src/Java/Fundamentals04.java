package Java;

public class Fundamentals04 {
	
	void m1() {
		System.out.println("Hello.....");
	}
	
	String m2() {
		return ("How are you..");
	}

	void m3(String Name) {
		System.out.println("Hello " + Name);
	}
	
	String m4(String Name) {
		return ("Hello " + Name);
	}
	
	public static void main(String[] args) {

		Fundamentals04 fn = new Fundamentals04();
		
		fn.m1();
		fn.m3("Nikhil");
		String sr = fn.m2();
		System.out.println(sr);
		
		String sr1 = fn.m4("Kachale");
		System.out.println(sr1);
		
		
		
	}

}
