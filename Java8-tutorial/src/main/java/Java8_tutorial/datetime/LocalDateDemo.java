package Java8_tutorial.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocalDateDemo {
	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now(); // now() is a static method of LocalDate class to return current date
		System.out.println("current date is :" + currentDate);

		System.out.println("formatted date :" + currentDate.format(DateTimeFormatter.ofPattern("dd-MMM-YYYY")));  //Date format

		LocalDate futureDate1 = currentDate.plusDays(4); // plusDays() to add number of days to a date
		System.out.println("future1 date is :" + futureDate1);

		LocalDate futureDate2 = currentDate.plusMonths(1); // plusMonths() to add number of days to a date
		System.out.println("future2 date is :" + futureDate2);

		LocalDate futureDate3 = currentDate.plusYears(2); // plusYears() to add number of days to a date
		System.out.println("future3 date is :" + futureDate3);

		System.out.println("Dates compare :" + futureDate1.isAfter(currentDate));
		System.out.println("Dates compare :" + futureDate1.isBefore(currentDate));

		LocalDate customDate = LocalDate.of(1991, 11, 26);
		System.out.println("custom date is :" + customDate);

		Month month = customDate.getMonth();
		System.out.println("month is :" + month);

		int monthInNumber = customDate.getMonthValue();
		System.out.println("monthInNumber is :" + monthInNumber);

		int dayOfMonth = customDate.getDayOfMonth();
		System.out.println("dayOfMonth is :" + dayOfMonth);

		DayOfWeek dayOfWeek = customDate.getDayOfWeek();
		System.out.println("dayOfWeek is :" + dayOfWeek);

		System.out.println("Number of days in this month : " + LocalDate.now().lengthOfMonth());
		System.out.println("Number of days in this year : " + LocalDate.now().lengthOfYear());
		System.out.println("Current year is leap year? : " + LocalDate.now().isLeapYear());
		System.out.println("Current Era: " + LocalDate.now().getEra());

		Date java7Date = new Date();
		LocalDate java8Date = java7Date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(); // util to local
		System.out.println("java7Date: " + java7Date);
		System.out.println("java8Date: " + java8Date);

		String dateInString = "2022-11-26";
		System.out.println("Date converted from string :" + LocalDate.parse(dateInString)); // String to date converter

		LocalDate dateInLocalDate = LocalDate.now();
		System.out.println("Date in string format: " + dateInLocalDate.toString()); // Date to string converter

	}

}
