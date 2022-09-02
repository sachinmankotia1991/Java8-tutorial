package Java8_tutorial.listsortingbylambda;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {
	public static void main(String[] args) {
		List<Book> listBooks = BookDao.getBooks();
		System.out.println("-------------------------------------Original List-------------------------------------");
		for (Book book : listBooks) {
			System.out.println(book);
		}

		
		
		System.out.println("\n-------------------------------------Sorting based on traditional Comparable interface-------------------------------------");
		Collections.sort(listBooks);
		for (Book book : listBooks) {
			System.out.println(book);
		}
		
		

		System.out.println("\n-------------------------------------Sorting based on traditional Comparator interface-------------------------------------");
		Comparator<Book> comparator = new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				if (o1.getBookPages() > o2.getBookPages()) {
					return 1;
				} else {
					return -1;
				}
			}
		};
		Collections.sort(listBooks, comparator);
		for (Book book : listBooks) {
			System.out.println(book);
		}

		
		
		System.out.println("\n-------------------------------------Sorting based on Lambda expression using comparator functional interface-------------------------------------");
		Collections.sort(listBooks, (o1, o2) -> {
			if (o2.getBookPages() > o1.getBookPages()) {
				return 1;
			} else {
				return -1;
			}
		});
		for (Book book : listBooks) {
			System.out.println(book);
		}

	}

}
