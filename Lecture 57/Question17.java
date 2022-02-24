package q11955;
import java.util.*;
public class ArrayListIterationDemo {
	public static void main(String[] args) {
		List<String> namesList = new ArrayList<String>();
		for (int i = 0; i<args.length;i++) { 
			if (args[i].charAt (0) >= 'A' && args[i].charAt (0) <= 'Z'){
				// add arguments to the namesList
				namesList.add (args[i]);
			}
		}
		for (Object name : namesList) {
			System.out.println(name);// print elements in the namesList
			
		}
	
	}
}
