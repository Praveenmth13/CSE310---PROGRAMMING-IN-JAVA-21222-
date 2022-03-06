package q11391;
import java.util.*;
public class SimpleArrayListDemo {
	public static void main(String[] args) {
		List<String> namesList = new ArrayList<String>();
		namesList.add("Hyderabad");
		
		//Add Bangalore to the namesList
		
		
		namesList.add("Bangalore");
		
		namesList.add("Chennai");
		
	
		//Add Chennai to the namesList
	
		for (String name : namesList) {
	
		// Print the String up to 3 characters using substring method
	System.out.println(name.substring(0, 3));
	
		}
	}
}
