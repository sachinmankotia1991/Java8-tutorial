package objectcomparison.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {
	public static void main(String[] args) {
		List<Laptop> laptops = new ArrayList<Laptop>();
		laptops.add(new Laptop("Dell", 8, 40000));
		laptops.add(new Laptop("HP", 16, 35000));
		laptops.add(new Laptop("Macbook", 12, 90000));

		Comparator<Laptop> comparator = new Comparator<Laptop>() {

			@Override
			public int compare(Laptop o1, Laptop o2) {
				if (o1.getRam() > o2.getRam()) {
					return 1;
				} else {
					return -1;
				}
			}
		};

		Collections.sort(laptops, comparator);
		for (Laptop laptop : laptops) {
			System.out.println(laptop);
		}
	}
}
