package java_code;

public class PalindromeNumber {

	public static void main(String[] args) {

		int no = 121;
		int temp = no;
		int rev = 0;
		int rem;
		while (temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		if (rev == no) {
			System.out.println("No is palindrom");
		} else {
			System.out.println("No is not palindrom");
		}
	}
}
