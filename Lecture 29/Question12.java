package q11182;
public class StringMethods {
	public static void main(String[] args) {
		String str = "http://docs.oracle.com/javase/7/docs/api/";
		String[] splits = str.split("/");
		for (String s : splits) {
			System.out.println(s);
		}
	}
}
