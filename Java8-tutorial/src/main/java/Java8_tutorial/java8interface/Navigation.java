package Java8_tutorial.java8interface;

public interface Navigation {

	public void navigateToCity();

	public default void navigateToVillage() {
		System.out.println("navigating to village from navigation interface");
	}

	public default void sendSMS() {
		System.out.println("sending message from navigation interface");
	}

	// static method
	static void printCompanyName() {
		System.out.println("This navigation devide is from Tomtom");
	}

}
