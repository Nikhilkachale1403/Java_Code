
public class array_code {

	public static void main(String[] args) {

		int  a[] = {10,20,30,40,50,60,70};
		
	
		int b[] = new int [a.length];
	
		//System.out.println(a.length);
		
		int count = a.length;
		
		for(int i=0; i<count; i++) {
			b[i] = a[count-1-i];
		}
		
		System.out.println("Original Array");
		for(int z=0; z<a.length; z++) {
			System.out.print(a[z]+" ");
		}
		
		
		System.out.println("Reverse using new array");
		for(int x=0; x<count; x++) {
			System.out.print(b[x] + " ");
		}
	}

}
