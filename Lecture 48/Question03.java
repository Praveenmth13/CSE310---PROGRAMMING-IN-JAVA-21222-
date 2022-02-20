package q11327;
public class TryCatchDemo3 {
	public static void main(String[] args) {
		String text1 = "3";
		int value1 = 0;
		try {
			value1 = Integer.parseInt(text1);
			System.out.println("Successfully parsed text1 as integer");
		} catch (NumberFormatException e) {
			System.out.println("Unable to parse text1 as integer");
		} finally {
			System.out.println("Inside finally block 1");
		}
		String text2 = "4g";
		int value2 = 0;
		try {
			value2 = Integer.parseInt(text2);
			System.out.println("Successfully parsed text2 as integer");
		} catch (NumberFormatException e) {
			System.out.println("Unable to parse text2 as integer");
		} finally {
			System.out.println("Inside finally block 2");
		}
	}
}
