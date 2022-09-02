package Java8_tutorial.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class PeriodAndDuration {
	public static void main(String[] args) {
		// Period is a utility class which works on top of LocalDate
		LocalDate empDOJ = LocalDate.of(2013, 3, 17);
		LocalDate empDOR = LocalDate.now();
		Period period = Period.between(empDOJ, empDOR);
		System.out.println("Duration years " + period.getYears());
		System.out.println("Duration months " + period.getMonths());
		System.out.println("Duration days " + period.getDays());
		System.out.println("TotalMonths days " + period.toTotalMonths());

		// Duration is a utility class which works on top of LocalTime
		LocalTime empLogin = LocalTime.of(9, 00, 0);
		LocalTime empLogout = LocalTime.now();
		Duration duration = Duration.between(empLogin, empLogout);
		System.out.println("Duration is " + duration);
		System.out.println("Duration in hours is " + duration.toHours());
		System.out.println("Duration in minutes is " + duration.toMinutes());
		System.out.println("Duration is seconds is" + duration.toSeconds());
	}

}
