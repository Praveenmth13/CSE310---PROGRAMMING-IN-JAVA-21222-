package q11189;
public class TestFormatter
{
	public static void main(String[] args)
	{
		double arg=Double.parseDouble(args[0]);
		System.out.printf("%,+012.3f",arg);
	}
}
