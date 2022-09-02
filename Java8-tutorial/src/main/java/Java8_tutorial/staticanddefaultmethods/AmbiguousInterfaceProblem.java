package Java8_tutorial.staticanddefaultmethods;

interface Greeting1 {
	default void hello() {
		System.out.println("hello from Greeting1");
	}
	
}

interface Greeting2 {
	default void hello() {
		System.out.println("hello from Greeting1");
	}
}

public class AmbiguousInterfaceProblem implements Greeting1, Greeting2 { // this will give compilation error as JDK is
																			// not able to decide that from which
																			// interface, hello() method needs to be
																			// Selected
	public static void main(String[] args) {
		new AmbiguousInterfaceProblem().hello();
	}

	// solution : override hello() method from one of the interface
	@Override
	public void hello() {
		Greeting1.super.hello();
	}
}
