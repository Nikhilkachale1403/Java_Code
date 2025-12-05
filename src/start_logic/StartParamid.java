package start_logic;

public class StartParamid {

	public static void main(String[] args) {

		for (int a=1; a<=5; a++) {
			for(int space =1; space<=5-a; space++) {
				System.out.print(" ");
			}
			for(int star=1; star <= 2*a-1; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
