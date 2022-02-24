package q11957;
import java.util.*;
public class ListDemo {
	public static void main(String[] args) {
		List namesList = new ArrayList();
		// Write your code here
		namesList.add ("Mercury");
		namesList.add ("Venus");
		namesList.add ("Earth");
		namesList.add ("Mars");
		
		
		System.out.println(namesList);
		namesList.remove (1);
		
		System.out.println(namesList);
	}
}



