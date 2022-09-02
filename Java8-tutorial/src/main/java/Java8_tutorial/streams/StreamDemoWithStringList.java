package Java8_tutorial.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemoWithStringList {

	public static void main(String[] args) {
		List<String> listNames = Arrays.asList("Sachin", "Naman", "Nishoo", "Saggy", "Sachin");

		System.out.println("\n------------------------distinct()-------------------------------");
		listNames.stream().distinct().collect(Collectors.toList()).forEach(t -> System.out.println(t));

		System.out.println("\n------------------------------map()-------------------------");
		listNames.stream().map(t -> t.concat(" yo")).collect(Collectors.toList()).forEach(t -> System.out.println(t));

		System.out.println("\n------------------------------count()-------------------------");
		long count = listNames.stream().count();
		System.out.println("Number of element :" + count);

		System.out.println("\n------------------------------findFirst()-------------------------");
		System.out.println(listNames.stream().findFirst().orElse("No Data Found"));

		System.out.println("\n------------------------------findAny()-------------------------");
		System.out.println(listNames.stream().findAny().orElse("No Data Found"));

		System.out.println("\n------------------------------distinct()+filter()+sorted()-------------------------");
		listNames.stream().distinct().filter(t -> t.length() > 5).sorted((o1, o2) -> {
			if (o1.length() > o2.length()) {
				return 1;
			} else {
				return -1;
			}
		}).collect(Collectors.toList()).forEach(t -> System.out.println(t));

		System.out.println(
				"\n------------------------------distinct()+filter()+sorted()+findFirst()-------------------------");
		System.out.println(listNames.stream().distinct().filter(t -> t.length() > 5).sorted((o1, o2) -> {
			if (o1.length() > o2.length()) {
				return 1;
			} else {
				return -1;
			}
		}).findFirst().orElse("No Data Found"));

	}
}
