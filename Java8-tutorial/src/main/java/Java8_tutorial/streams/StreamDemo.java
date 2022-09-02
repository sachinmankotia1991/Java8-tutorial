package Java8_tutorial.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import Java8_tutorial.streams.Person.Gender;

public class StreamDemo {
	public static void main(String[] args) {

		List<Person> listPerson = List.of(new Person("Ram", 40, Gender.MALE, List.of("TCM", "DI")), 
										  new Person("Seeta", 38, Gender.FEMALE, List.of("FMS", "CSA")),
										  new Person("Lakshman", 35, Gender.MALE, List.of("DRE", "GC")), 
										  new Person("Hanuman", 39, Gender.MALE, List.of("TCM", "GC")),
										  new Person("Bharat", 48, Gender.MALE, List.of("DI", "FMS")), 
										  new Person("Manthara", 32, Gender.FEMALE, List.of("FMC", "DI")));

		// ****************Java streams examples****************
		
		System.out.println("\n----------------------------Java 8 Streams forEach() example----------------------------");
		listPerson.forEach(t -> System.out.println(t));
		
		System.out.println("\n----------------------------Java 8 Streams map() example----------------------------");
		Set<Person> modifiedSet = listPerson.stream().map(t -> new Person(t.getName(), t.getAge()+2, t.getGender(), t.getProjects())).collect(Collectors.toSet());
		modifiedSet.forEach(t -> System.out.println(t));

		
		System.out.println("\n----------------------------Java 8 Streams filter() example----------------------------");
		// used to sort data based on custom condition It internally use Comparator
		// functional interface
		List<Person> listFemales = listPerson.stream().filter(p -> p.getGender().equals(Gender.FEMALE))
				.collect(Collectors.toList());
		listFemales.forEach(t -> System.out.println(t));

		System.out.println("\n----------------------------Java 8 Streams sorted() example----------------------------");
		// used to sort data based on custom condition It internally use Comparator
		// functional interface
		List<Person> listSortedPerson = listPerson.stream().sorted((o1, o2) -> {
			if (o1.getAge() > o2.getAge()) {
				return 1;
			} else {
				return -1;
			}
		}).collect(Collectors.toList());
		listSortedPerson.forEach(t -> System.out.println(t));

		System.out.println("\n----------------------------Java 8 Streams allMatch() example----------------------------");
		// Used to check a common condition across full list. Even if one element is
		// failed to pass,
		// it will return false It internally uses Predicate functional

		boolean allMatch = listPerson.stream().allMatch(p -> p.getAge() > 50);
		System.out.println("Is any of the person is this list has age greater than 50? " + allMatch);

		System.out.println("\n----------------------------Java 8 Streams anyMatch() example----------------------------");
		// Used to check a common condition across full list. Even if one element is
		// failed to pass, it will return false It internally uses Predicate functional
		// interface
		boolean anyMatch = listPerson.stream().anyMatch(p -> p.getAge() > 50);
		System.out.println("Is everyone is this list has age greater than 50? " + anyMatch);

		System.out.println("\n----------------------------Java 8 Streams noneMatch() example----------------------------");
		// Returns true if none of the value matches the condition, else returns false
		boolean noneMatch = listPerson.stream().noneMatch(p -> p.getName().equals("Sachin"));
		System.out.println("Is anyone is this list has name as Sachin? " + noneMatch);

		System.out.println("\n----------------------------Java 8 Streams min() example----------------------------");
		listPerson.stream().min(Comparator.comparing(Person::getAge)).ifPresent(p -> System.out.println(p));
		
		System.out.println("\n----------------------------Java 8 Streams max() example----------------------------");
		listPerson.stream().max(Comparator.comparing(Person::getAge)).ifPresent(p -> System.out.println(p));
		
		System.out.println("\n----------------------------Java 8 Streams findFirst() example----------------------------");
		Optional<Person> optFirstPerson = listPerson.stream().findFirst();
		if(optFirstPerson.isPresent()) {
			System.out.println(optFirstPerson.get());
		}
		
		System.out.println("\n----------------------------Java 8 Streams findAny() example----------------------------");
		Optional<Person> optAnyPerson = listPerson.stream().findAny();
		if(optAnyPerson.isPresent()) {
			System.out.println(optAnyPerson.get());
		}
		
		System.out.println("\n----------------------------Java 8 Streams flatMap() example----------------------------");
		//flat map is used to flat stream of list to objects to stream of object
		String strProjects = listPerson.stream().map(p -> p.getProjects()).flatMap(strings -> strings.stream())
				.collect(Collectors.joining(","));
		System.out.println("Projects are :"+strProjects);
		
		System.out.println("\n----------------------------Java 8 Streams short circuit operations skip() and limit() example----------------------------");
		listPerson.stream().skip(1).limit(3).forEach(t -> System.out.println(t));
		
	}
}
