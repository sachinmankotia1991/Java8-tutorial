package Java8_tutorial.staticanddefaultmethods;

interface Greeting {
	default void hello() {
		System.out.println(" hello from A");
	}
}

interface GreetingExtn extends Greeting {
	default void hello() {
		System.out.println(" hello from B");
	}
}

public class InheritanceProblem implements Greeting, GreetingExtn {
	/*
	 * public void hello() { System.out.println(" hello from C"); }
	 */

	public static void main(String[] args) {
		new InheritanceProblem().hello();
	}
}
