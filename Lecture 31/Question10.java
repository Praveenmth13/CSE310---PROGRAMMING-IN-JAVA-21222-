package q11200;
public class AttachTag
{
	public static void main(String[] args)
	{
		String s1 = "["+args[1]+"]";
		String s2 = "[/"+args[1]+"]";
		String a =s1+args[0]+s2;
		System.out.println(a);
	}
}
