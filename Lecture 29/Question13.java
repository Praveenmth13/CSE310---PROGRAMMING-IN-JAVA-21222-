package q11183;
public class StringSplit
{
	public static void main(String[] args) {
		String[] splits = args[0].split(args[1]);
		for (String s : splits) {
			System.out.println(s.trim());
		}
	}
}
