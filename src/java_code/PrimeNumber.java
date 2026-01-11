package java_code;

public class PrimeNumber {

	public static void main(String[] args) {

		int a=7;
		int temp=0;
		for(int i=2;i<=a; a++) {
			if(temp%i==0) {
				temp++;
			}
		}
		if(temp>0) {
			System.out.println("nu is prime");
		}
		else {
			System.out.println("nu is not prime");
		}
	}

}
