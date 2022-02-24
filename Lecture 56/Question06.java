package q11365;
import java.util.*;
public class IteratorDemo {
	public static void main(String[] args) {
		List planetsList = new ArrayList();
		planetsList.add("Mercury");
		planetsList.add("Venus");
		planetsList.add("Earth");
		planetsList.add("Mars");
		planetsList.add("Jupiter");
		planetsList.add("Saturn");
		planetsList.add("Uranus");
		planetsList.add("Neptune");
		planetsList.add("Pluto");
		Iterator itr = planetsList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
