package q11335;
public class ThrowExample {
	public static void main(String args[]) {
		int  age=Integer.parseInt(args[0]);
		int  wt=Integer.parseInt(args[1]);
		System.out.println("Welcome to the Registration process!!");
		try {
			checkEligibilty(age,wt);
			System.out.println("Have a nice day");
			}
			catch(Exception e) {
				System.out.println("java.lang.ArithmeticException: Student is not eligible for registration"); 
			}
	}
			static void checkEligibilty(int age, int wt) {
				if(age<12 && wt<40) {
				throw new ArithmeticException("Student is not eligible for registration"); 
				} else {
					System.out.println("Student Entry is Valid!!");
					
				}
			}
}
