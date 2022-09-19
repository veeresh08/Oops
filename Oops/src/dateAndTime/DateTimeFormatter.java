package dateAndTime;

import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;

public class DateTimeFormatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime dt =  LocalDateTime.now();//date
		System.out.println(dt);
		
//		java.time.format.DateTimeFormatter df = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy -- E"); //format
		java.time.format.DateTimeFormatter df = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy -- E H:m a"); //format
		java.time.format.DateTimeFormatter df2 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE;
		String myDate = dt.format(df);
		System.out.println(myDate);
	}

}
