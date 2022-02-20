package q11319;
public class ExceptionDemo3 {
	public static void main(String[] args) {
		String text1 = "3";
		String text2 = "4";
		int result = convertAndAdd(text1, text2);
		System.out.println("result = " + result);
	}
	public static int convertAndAdd(String number1Text, String number2Text) {
		int number1 = Integer.parseInt(number1Text);
		int number2 = Integer.parseInt(number2Text);
		return number1 + number2;
	}
}
