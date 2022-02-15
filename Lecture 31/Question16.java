package q11206;
public class TestString {
	public static void main(String[] args){
		String input = args[0];
		int size = input.length();
		System.out.println(input.substring(0,3)+input.substring(size-3 , size));
	}
}
