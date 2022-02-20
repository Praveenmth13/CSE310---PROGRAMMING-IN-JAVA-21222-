Select all the correct statements for the below code:

public class TrickyExample {
	public static void main(String[] args) {
		String text1 = "3";
		String text2 = "4g";
		System.out.println(getTotal(text1, text2));
	}
	public static int getTotal(String text1, String text2) {
		int value1 = 0;
		int value2 = 0;
		try {
			value1 = Integer.parseInt(text1);
			value2 = Integer.parseInt(text2);
			return value1 + value2;
		} catch (NumberFormatException e) {
			return -1;
		} finally {
			return -2;
		}
	}
}

=> ANSWER
D.) The code will print -2.
