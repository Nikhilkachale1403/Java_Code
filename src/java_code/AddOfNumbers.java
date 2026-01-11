package java_code;

public class AddOfNumbers {

	public static void main(String[] args) {

		int num = 12345;
		int rem=0;
		int temp=num;
		int sum=0;
		
		while (temp>0) {
			rem=temp%10;
			sum = sum + rem;
			temp=temp/10;
		}
		System.out.println(sum);
	}

}
