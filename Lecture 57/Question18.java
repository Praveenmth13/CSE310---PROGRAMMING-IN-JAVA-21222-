package q23673;
import java.util.*;
public class ArrayListIterationDemo {
	public static void main(String[] args) {
	List < String > namesList = new ArrayList < String > ();
	for(int i = 0; i < args.length;i++){
		namesList.add (args[i]);
	}
	
	for(int i = 0; i<namesList.size (); i++){
		System.out.println ("Name at index " + i + " is : " +namesList.get (i));
		}
	}
}
