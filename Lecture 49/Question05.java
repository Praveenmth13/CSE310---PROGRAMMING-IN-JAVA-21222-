package q11338;
public class MyException {
	public static void main (String[] args) {
		int num=Integer.parseInt(args[0]);
		try {
			int x = Integer.parseInt(args[0]);
			if (num>=25 && num<=50) // write the condition
				
				System.out.println("Given number : " + x);
				else throw new NumberRangeException();
		}
		catch (NumberRangeException e) {
			System.out.println("q11338.NumberRangeException"); // Fill the missing ClassLoader}
		}
	}
	class NumberRangeException extends Exception {
		public	NumberRangeException(){
			System.out.println("Please enter a number between 25 and 50");
		} 
	}
