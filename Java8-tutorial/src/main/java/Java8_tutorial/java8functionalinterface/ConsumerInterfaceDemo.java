package Java8_tutorial.java8functionalinterface;

import java.util.function.Consumer;

public class ConsumerInterfaceDemo {

	public static void main(String[] args) {
		Student student = new Student(123, "Sachin");
		System.out.println("Original student object : " + student.toString());
		Consumer<Student> consumer = (test) -> test.setStudentName("Naman");
		consumer.accept(student);
		System.out.println("Modified student object : " + student.toString());

	}
}
