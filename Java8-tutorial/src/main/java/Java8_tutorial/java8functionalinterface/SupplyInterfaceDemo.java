package Java8_tutorial.java8functionalinterface;

import java.util.function.Supplier;

public class SupplyInterfaceDemo {

	public static void main(String[] args) {
		Supplier<Double> getRandomDouble = () -> Math.random();
		System.out.println(getRandomDouble.get());
	}
}
