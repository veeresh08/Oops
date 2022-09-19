package dateAndTime;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class CalenderClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Calendar c = Calendar.getInstance();
//		System.out.println(c.getCalendarType());
//		System.out.println(c.getTimeZone());
		
		
		Calendar c1 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
		System.out.println(c1.getCalendarType());
		System.out.println(c1.getTimeZone().getID());
		
		

		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.SECOND));
		System.out.println(c.get(Calendar.HOUR));
		System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+ c.get(Calendar.MINUTE)+":"+ c.get(Calendar.SECOND));
		GregorianCalendar cal = new GregorianCalendar();
		System.out.println(cal.isLeapYear(2020));
		
		System.out.println(TimeZone.getAvailableIDs()[0]);
		System.out.println(TimeZone.getAvailableIDs()[2]);
		System.out.println(TimeZone.getAvailableIDs()[73]);
		
	}

}
