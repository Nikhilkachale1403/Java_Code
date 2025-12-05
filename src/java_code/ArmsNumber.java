package java_code;

public class ArmsNumber {

	public static void main(String[] args) {

		   int a = 153;
	        int rem = 0;
	        int arms = 0;
	        int temp = a;

	        while (temp != 0) {
	            rem = temp % 10;
	            arms = arms + (rem * rem * rem);
	            temp = temp / 10;
	        }

	        if (a == arms) {
	            System.out.println(a + " is armstrong number");
	        } else {
	            System.out.println(a + " is not armstrong number");
	        }
	    }

}
