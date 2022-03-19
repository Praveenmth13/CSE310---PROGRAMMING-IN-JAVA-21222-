package q11589;
import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class CalendarDemo {
	public String setTime(String dateString) throws ParseException {
		// use the correct format string as argument for the constructor
		SimpleDateFormat sd = new SimpleDateFormat("MMM-dd-yyyy");
			
			// parses text from the beginning of the given string to produce a dateString
			Date date =  sd.parse(dateString);
				
					
			Calendar currentTime = Calendar.getInstance();
			currentTime.setTime(date);
			return sd.format(currentTime.getTime());
	}
}
