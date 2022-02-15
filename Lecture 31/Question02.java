package q11192;
public class PrefixCheck
{
	public static void main(String[] args)
	{
		if(args[0].startsWith("en"))
		{
			System.out.println(args[0]);
		}
		else
		{
			System.out.println("en"+args[0]);
		}
	}
}
