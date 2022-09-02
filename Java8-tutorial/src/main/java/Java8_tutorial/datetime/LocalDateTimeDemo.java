package Java8_tutorial.datetime;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeDemo {
	public static void main(String[] args) {
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("currentDateTime is " + currentDateTime);

		LocalDate localDate = currentDateTime.toLocalDate();
		System.out.println("converted localDate is " + localDate);

		LocalTime localTime = currentDateTime.toLocalTime();
		System.out.println("converted localTime is " + localTime);

		LocalDateTime customLocalDateTime = LocalDateTime.of(2022, 8, 5, 06, 11, 0, 0);
		System.out.println("customLocalDateTime is " + customLocalDateTime);

		Timestamp timestamp = Timestamp.valueOf(customLocalDateTime); // convert to SQL time
		System.out.println("SQL timestamp is " + timestamp);

		System.out.println("Local timestamp is " + timestamp.toLocalDateTime()); // convert from SQL time

		LocalDate localDate1 = LocalDate.now();
		LocalTime localTime1 = LocalTime.now();
		LocalDateTime localDateTime1 = LocalDateTime.of(localDate1, localTime1);
		System.out.println("Combining LocalDate+LocalTime " + localDateTime1);
	}
}
