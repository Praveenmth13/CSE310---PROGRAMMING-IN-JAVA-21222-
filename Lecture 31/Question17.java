package q11207;
public class TestString{
	public static void main(String[] args){
		String input = args[0];
		int size = input.length();
		String first = input.substring(0,1);
		System.out.println(input.substring(1,size)+first+"aa");
	}
}
