package q11201;
public class PutInsideTag
{
	public static void main(String[] args)
	{
		int mid = args[0].length()/2;
		String s1 = args[0].substring(0,mid);
		String s2 = args[0].substring(mid,args[0].length());
		System.out.println(s1+args[1]+s2);
	}
}
