package Java8_tutorial.staticanddefaultmethods;

interface Sum {
	public void sum(int a, int b);
}

class PlayingWithFucntionalInterfaces {
	public static void main(String[] args) {
		Sum s = (a, b) -> System.out.println("The sum of numbers is: " + (a + b));
		s.sum(24, 14);
	}
}