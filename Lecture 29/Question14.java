package q11184;
public class PalindromeOrNot
{
	public static void main(String[] args)
	{
		String str = args[0];
		String reverse = new StringBuffer(str).reverse().toString();
		
		if (str.equals(reverse))
		{
			System.out.println("The given string "+str+" is a palindrome");
		}
		else
		{
			System.out.println("The given string "+str+" is not a palindrome");
		}
	}
}
