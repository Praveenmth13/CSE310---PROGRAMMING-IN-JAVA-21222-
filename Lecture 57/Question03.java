package q11368;
import java.util.*;
public class ArrayListIterationDemo {
	public static void main(String[] args) {
		List namesList = new ArrayList();
		for (String argument : args) {
			if (Character.isUpperCase(argument.charAt(0))) {
				namesList.add(argument);
			}
		}
		for (Object name : namesList) {
			System.out.println(name);
		}
		for (int i = 0; i < namesList.size(); i++) {
			Object name = namesList.get(i);
			System.out.println("Name at index " + i + " is : " + name);
		}
	}
}
