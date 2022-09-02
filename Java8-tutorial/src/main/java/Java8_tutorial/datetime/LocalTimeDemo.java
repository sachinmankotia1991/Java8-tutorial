package Java8_tutorial.datetime;

import java.time.LocalTime;

public class LocalTimeDemo {
	public static void main(String[] args) {
		LocalTime currentTime = LocalTime.now();
		System.out.println("currentTime  is :" + currentTime);

		LocalTime customTime = LocalTime.of(16, 10, 58);
		System.out.println("customTime  is :" + customTime);

		System.out.println("customTime is before currentTime? " + customTime.isBefore(currentTime));

		System.out.println("customTime is after currentTime? " + customTime.isAfter(currentTime));

		System.out.println("Adding hours " + currentTime.plusHours(2));

		System.out.println("Minus hours " + currentTime.minusHours(2));

		String timeInString = "15:02:32";
		System.out.println("Parsed time " + LocalTime.parse(timeInString));

	}
}
