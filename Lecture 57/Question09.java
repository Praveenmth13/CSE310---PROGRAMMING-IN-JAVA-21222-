package q11960;
import java.util.*;
public class ListDemo {
	public static void main(String[] args) {
		List<String> namesList1 = new ArrayList<String>();
		
		// add List1 elements here
		namesList1.add ("Mercury");
		namesList1.add ("Venus");
		namesList1.add ("Earth");
		namesList1.add ("Mars");
		
		
		System.out.print("Elements in List1: ");
		System.out.println(namesList1);
		
		
		
		List<String> namesList2 = new ArrayList<String>();
		
		// add List2 elements here
		namesList2.add ("Jupiter");
		namesList2.add ("Saturn");
		namesList2.add ("Uranus");
		namesList2.add ("Neptune");
		
		System.out.print("Elements in List2: ");
		System.out.println(namesList2);
		System.out.println("After adding List2 elements to List1");
		
		// add all List2 elements to List1
		
		namesList1.addAll (namesList2);
		for(Object name:namesList1) {
			System.out.println(name);
		}
		
		System.out.println("After adding List2 elements at index 2 the list becomes:");
		
		// add all LIst2 elements at index 2
		namesList1.addAll (2, namesList2);
		for(Object name:namesList1) {
			System.out.println(name);
		}
	
	}
}





