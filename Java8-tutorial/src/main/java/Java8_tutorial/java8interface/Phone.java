package Java8_tutorial.java8interface;

public interface Phone {

	public void docall();

	// this is default method of interface
	// without 'default' keyword, there will be compilation error
	public default void sendSMS() {
		System.out.println("sending message from phone interface");
	}

	// static method
	static void printCompanyName() {
		System.out.println("This phone is from Samsung");
	}

}
