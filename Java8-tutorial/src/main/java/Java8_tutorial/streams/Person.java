package Java8_tutorial.streams;

import java.util.List;

public class Person {

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [name=").append(name).append(", age=").append(age).append(", gender=").append(gender)
				.append(", projects=").append(projects).append("]");
		return builder.toString();
	}

	public List<String> getProjects() {
		return projects;
	}

	public void setProjects(List<String> projects) {
		this.projects = projects;
	}

	public enum Gender {
		MALE, FEMALE
	};

	private String name;
	private int age;
	private Gender gender;
	private List<String> projects;

	public Person(String name, int age, Gender gender, List<String> projects) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.projects = projects;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {

		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

}
