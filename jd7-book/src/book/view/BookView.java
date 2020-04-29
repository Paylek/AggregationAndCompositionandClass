package book.view;


import java.util.List;

import book.bean.Book;

public class BookView {
	public void showLibrary(List<Book> booksList) {

		for (Book c : booksList) {
			System.out.println(c);
		}
	}
}
