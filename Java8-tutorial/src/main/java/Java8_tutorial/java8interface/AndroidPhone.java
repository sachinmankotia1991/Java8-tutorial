package Java8_tutorial.java8interface;

public class AndroidPhone implements Phone, Navigation {

	@Override
	public void docall() {
		System.out.println("calling from androidphone class");

	}

	@Override
	public void navigateToCity() {
		System.out.println("navigating to village from androidPhone class");

	}

	// You need to overwrite default method from one of the interface because JDK is
	// not able to decide which default method to be called when you invoke
	// androidPhone.sendSMS()
	@Override
	public void sendSMS() {
		System.out.println("sending message from androidPhone class");
	}

}
