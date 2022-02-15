package q11198;
public class RemoveChar
{
	public static void main(String[] args)
	{
		int size=args[0].length();
		System.out.println(args[0].substring(0,2)+args[0].substring(3,size));
	}
}
