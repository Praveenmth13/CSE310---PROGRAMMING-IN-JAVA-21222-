package q23676;
import java.util.*;
public class ArrayListIterationDemo {
	public static void main(String[] args) {
	List < String > nameList = new ArrayList < String > ();
	for (int i = 0; i<args.length;i++)
	{
		nameList.add (args[i]);
	}
	System.out.println ("Name at index 2 is : " + nameList.get (2));
	}
}
