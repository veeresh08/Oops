package dateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class java_time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate d = LocalDate.now();
		System.out.println(d);
		
		LocalTime t = LocalTime.now();
		System.out.println(t);
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);

	}

}
