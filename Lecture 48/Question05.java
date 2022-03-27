package q11329;
public class Division {
	public static void main (String args[]) {		
		int num1 = Integer.parseInt(args[0]);		
		int num2 = Integer.parseInt(args[1]),result = 0;		
		try{			
			result = num1/num2;			
			System.out.println("Result = " +result);			
		}		
		catch (ArithmeticException e) {		
			System.out.println ("Exception caught : divide by zero occurred" );			
		}		
	}	
}
