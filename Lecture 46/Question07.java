package q11589;
import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class CalendarDemo {
	public String setTime(String dateString) throws ParseException {
		// use the correct format string as argument for the constructor
		SimpleDateFormat sd = new SimpleDateFormat("MMM-dd-yyyy");
		
		// parses text from the beginning of the given string to produce a date
		Date date =  sd.parse(dateString);
		
		
		Calendar currentTime = Calendar.getInstance();
		
		//// configuring the current object to the value of date
    	currentTime.setTime(date);
    	
    	// format method on SimpleDateFormat returns a string representation of the passed date
    	return sd.format(currentTime.getTime());
	}
}
