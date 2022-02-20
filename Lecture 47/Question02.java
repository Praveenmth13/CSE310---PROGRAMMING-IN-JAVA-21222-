package q11318;
public class ExceptionDemo2 {
	public static void main(String[] args) {
		int number1 = 34;
		int number2 = 2;
		int result = divide(number1, number2);
		System.out.println("result = " + result);
	}
	public static int divide(int number, int divisor) {
		return number / divisor;
	}
}
