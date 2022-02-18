package q11315;
import java.util.*;
public class DateDemo {
	public static void main(String ... args) {
		Date thisMoment = new Date();
		long millisecondsSinceEpochStart = thisMoment.getTime();
		System.out.println("This Moment : " + thisMoment);
		System.out.println("Total milli seconds from epoch to this moment : " + millisecondsSinceEpochStart);
	}
}
