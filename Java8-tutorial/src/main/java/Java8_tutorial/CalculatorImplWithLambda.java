package Java8_tutorial;

public class CalculatorImplWithLambda {
	public static void main(String[] args) {

//		Calculator calculator = () -> System.out.println("Lambda way of printing switchOn method body");
//		calculator.printNormalMsg();

//		Calculator calculator = (a) -> System.out.println("Printed number is "+a);
//		calculator.printANumber(10);

//		Calculator calculator = (a,b) -> a+b;
//		System.out.println(calculator.addTwoNumbers(10,20));

//		Calculator calculator = (a,b) -> a-b;
//		System.out.println(calculator.substractTwoNumbers(20,10));

		Calculator calculator = (a, b) -> {
			if (a > b) {
				return a - b;
			} else {
				throw new RuntimeException("First number should be greater that second number");
			}
		};
		System.out.println(calculator.conditionalSubstractTwoNumbers(20, 10));
	}
}