package Java8_tutorial.java8functionalinterface;

import java.util.function.Predicate;

public class PredicateInteraceDemo {
	public static void main(String[] args) {
		// Predicate : return boolean value based a certain data
		Predicate<String> lengthEligibility = (str) -> str.length() > 5;
		// checking length using Predicate
		System.out.println(lengthEligibility.test("Sachin"));

		
	
	}

}
