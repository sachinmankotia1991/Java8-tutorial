package Java8_tutorial.java8interface;

public class Test {
	public static void main(String[] args) {
		AndroidPhone androidPhone = new AndroidPhone();

		androidPhone.docall();

		androidPhone.navigateToCity();

		// If your class implements single interface and that interface has default
		// method sendSMS, then below call will work fine.
		// But if you class implements more than one interface and all interface has
		// same default method, the you need to overwrite that default method in child
		// class,
		// otherwise JDK will be confused that from which interface we need to call that
		// default method.
		androidPhone.sendSMS();
		
		// calling static method from Phone interface
		Phone.printCompanyName();

	}
}
