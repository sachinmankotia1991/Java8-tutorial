package Java8_tutorial.forEachdemo;

import java.util.Arrays;
import java.util.List;

public class ForEachDemo {
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(10, 11, 12, 13, 14);

		// Printing data using normal for loop
		for (int i = 0; i < values.size(); i++) {
			System.out.println("Printing data using normal for loop: " + values.get(i));
		}

		System.out.println("---------------------------------------------------------------------------");
		for (Integer integer : values) {
			System.out.println("Printing data using normal for loop: " + integer);
		}

		System.out.println("---------------------------------------------------------------------------");
		values.forEach(i -> System.out.println("Printing data using foreach method: " + i));
	}
}
