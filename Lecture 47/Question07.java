package q11323;
public class TryCatchDemo2 {
	public static void main(String[] args) {
		String text1 = "33";
		String text2 = "44a";
		System.out.println("before parsing text1");
		int value1 = Integer.parseInt(text1);
		System.out.println("value1 = " + value1);
		try {
			int value2 = Integer.parseInt(text2);
			System.out.println("value2 = " + value2);
		} catch (NumberFormatException e) {
			System.out.println("could not parse text2 = " + text2);
		}
	}
}
//
