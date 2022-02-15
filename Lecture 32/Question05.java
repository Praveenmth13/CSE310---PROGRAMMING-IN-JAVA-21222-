Understanding the above concept, select all the correct statements for the below code:
public class AutoBoxingExample {	 
	public static void main(String[] args) {
		int num1 = 3; //statement 1
		System.out.println("Square of " + num1 + " is : " + calculateSquare(num1)); //statement 2
	}
	
	public static Integer calculateSquare(Integer number) { //statement 3
		return number * number;  //statement 4
	}
}


Answer

In statement 4, number is first unboxed and later the product is autoboxed gain before being returned.
