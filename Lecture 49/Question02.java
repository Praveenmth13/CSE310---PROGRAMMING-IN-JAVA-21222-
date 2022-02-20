package q11335;
public class ThrowExample {
	public static void main(String args[]) {
		
		
		int  age=Integer.parseInt(args[0]);
		
		int  wt=Integer.parseInt(args[1]);
		
		
		System.out.println("Welcome to the Registration process!!");
		try {
			checkEligibilty(age,wt); // Fill the missing code
			System.out.println("Have a nice day");
		}
		catch(Exception e) { // Fill the missing code
			System.out.println("java.lang.ArithmeticException: Student is not eligible for registration"); // Fill the missing code
		}
	}
	static void checkEligibilty(int age, int wt) {
		if(age<12 && wt<40) { // Write the condition
			throw new ArithmeticException("Student is not eligible for registration"); // Fill the missing code
		} else {
			System.out.println("Student Entry is Valid!!");
		}
	}
}
