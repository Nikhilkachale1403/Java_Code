package java_code;

public class LargeNumber {

	public static void main(String[] args) {

		int a = 30;
		int b = 20;
		int largenum = a < b ? a : b; // if expression is true then return first value else return second value.

		System.out.println(largenum);
		System.out.println("=============");

		int c = 60;
		int d = 50;
		if (c > d) {
			System.out.println("c is greater than d ");
		} else {
			System.out.println("c is less than d");
		}
	}
}
