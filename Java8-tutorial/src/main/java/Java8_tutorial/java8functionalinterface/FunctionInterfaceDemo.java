package Java8_tutorial.java8functionalinterface;

import java.util.function.Function;

public class FunctionInterfaceDemo {
	public static void main(String[] args) {

		Function<Integer, String> result = t -> t * 10 + " data is multiplied by 10";
		System.out.println(result.apply(10));

	}
}
