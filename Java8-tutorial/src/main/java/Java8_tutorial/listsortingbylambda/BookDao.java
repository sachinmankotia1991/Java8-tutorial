package Java8_tutorial.listsortingbylambda;

import java.util.ArrayList;
import java.util.List;

public class BookDao {

	public static List<Book> getBooks() {
		List<Book> listBook = new ArrayList<Book>();
		listBook.add(new Book(101, "Learn Java", 400));
		listBook.add(new Book(103, "HTML Fundamentals", 100));
		listBook.add(new Book(90, "Learn HTML", 300));
		listBook.add(new Book(102, "Headfirst Java", 200));
		return listBook;
	}

}
