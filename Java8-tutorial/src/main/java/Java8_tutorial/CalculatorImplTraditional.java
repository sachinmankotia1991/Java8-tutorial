package Java8_tutorial;

public class CalculatorImplTraditional implements Calculator {

	public static void main(String[] args) {
		Calculator calculator = new CalculatorImplTraditional();
		calculator.conditionalSubstractTwoNumbers(20, 10);
	}

//	@Override
//	public void printNormalMsg() {
//		System.out.println("printNormalMsg");
//	}
//
//	@Override
//	public void printANumber(int a) {
//		System.out.println("printANumber " + a);
//	}
//
//	@Override
//	public int addTwoNumbers(int a, int b) {
//		System.out.println("addTwoNumbers " + (a + b));
//	}
//
//	@Override
//	public int substractTwoNumbers(int a, int b) {
//		System.out.println("substractTwoNumbers " + (a - b));
//	}

	@Override
	public int conditionalSubstractTwoNumbers(int a, int b) {
		if (a > b) {
			System.out.println("inside condition 1");
			return a - b;
		} else {
			throw new RuntimeException("First number should be greater that second number");
		}
	}
}
