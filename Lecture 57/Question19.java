package q24085;
import java.util.*;
public class ArrayListIterationDemo {
	public static void main(String[] args) {
		List<String> namesList = new ArrayList<String>();
		// write your code here
		for(int i = 0; i<args.length;i++)
		{
			namesList.add (args[i]);
		}
		System.out.println (namesList);
		System.out.println ("Size of the list is : " + namesList.size ());
	}
}
