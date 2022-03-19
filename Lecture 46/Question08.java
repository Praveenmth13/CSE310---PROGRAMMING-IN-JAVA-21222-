package q11590;
import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class CalendarAddition {
		public String addDays(String dateString, int days) throws ParseException {
		// use the correct format string as argument for the constructor
		SimpleDateFormat sd = new SimpleDateFormat("MMM-dd-yyyy");
									
		// parses text from the beginning of the given string to produce a dateString		
		Date date =  sd.parse(dateString);
		Calendar cal = Calendar.getInstance();
															
		// configuring the cal object to the value of dateString		
		cal.setTime(date);
																	
		// supply the correct arguments to the add method below
		cal.add(Calendar.DATE,days);
																					
		// format method on SimpleDateFormat returns a string representation of the passed DATE		
		return sd.format(cal.getTime());
		}
}
