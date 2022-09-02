package Java8_tutorial.listsortingbylambda;

public class Book implements Comparable<Book> {

	private int bookId;
	private String bookName;
	private int bookPages;

	public Book(int bookId, String bookName, int bookPages) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPages = bookPages;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookPages() {
		return bookPages;
	}

	public void setBookPages(int bookPages) {
		this.bookPages = bookPages;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book [bookId=").append(bookId).append(", bookName=").append(bookName).append(", bookPages=")
				.append(bookPages).append("]");
		return builder.toString();
	}

	@Override
	public int compareTo(Book o) {
		if (this.bookId > o.bookId) {
			return 1;
		} else {
			return -1;
		}
	}

}
