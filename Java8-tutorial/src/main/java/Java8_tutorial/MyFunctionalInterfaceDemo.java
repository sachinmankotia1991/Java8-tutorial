package Java8_tutorial;

@FunctionalInterface
public interface MyFunctionalInterfaceDemo {
	void m1(); // this is exact one abstract method in this interface

	default void m2() {
		System.out.print("this is method m2");
	}

	default void m3() {
		System.out.print("this is method m3");
	}

}
