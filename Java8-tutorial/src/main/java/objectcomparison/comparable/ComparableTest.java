package objectcomparison.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {
	public static void main(String[] args) {
		List<Laptop> laptops = new ArrayList<Laptop>();
		laptops.add(new Laptop("Dell", 8, 40000));
		laptops.add(new Laptop("HP", 16, 35000));
		laptops.add(new Laptop("Macbook", 12, 90000));

		Collections.sort(laptops);
		for (Laptop laptop : laptops) {
			System.out.println(laptop);
		}
	}
}
