package java_fundamentals;

public class ControlStatement01 {

	public static void main(String[] args) {

		 String uname = "Admin";
		 String pword = "Admin123";
		  if(uname.equals("Admin")) {
			 System.out.println("U name is correct");
			 
			 if(pword.equals("Admin1232")) {
				 System.out.println("pass is is correct");
				 System.out.println("logged in succefully");
			 }
			 else {
				 System.out.println("incorrect pass");
			 }
				
		  }
		  else			  
		  {
			  System.out.println("incorrect creds");
		  }
	}
}
