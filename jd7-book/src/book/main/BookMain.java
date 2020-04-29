package book.main;

import java.util.List;

import book.bean.Book;
import book.bean.Library;
import book.logic.BookLogic;
import book.view.BookView;

public class BookMain {
	public static void main(String[] args) {
		Library libraryLenina = new Library("Ленина");
		BookLogic logic = new BookLogic();
		BookView view = new BookView();

		libraryLenina.addBookToLibraryList(new Book(0, "Гордость и предубеждение     ", "Гоголь Н.В", "Питер", 1975, 532, "2р50к", "Твердый"));
		libraryLenina.addBookToLibraryList(new Book(1, "Вечный рай", "Толстой Л.Н", "Москва", 1965, 1523, "5р50к", "Твердый"));
		libraryLenina.addBookToLibraryList(new Book(2, "Великий Гэтсби", "Гоголь Н.В", "Питер", 1973, 445, "2р50к", "Мягкий"));
		libraryLenina.addBookToLibraryList(new Book(3, "1984", "Булгаков М.А", "Минск", 1992, 600, "3р23к", "Твердый"));
		libraryLenina.addBookToLibraryList(new Book(4, "Стихи    ", "Крылов И.А", "Питер", 1998, 286, "1р40к", "Мягкий"));
		libraryLenina.addBookToLibraryList(new Book(5, "Преступление и наказание", "Достоевский Ф.М", "Минск", 1969, 756, "3р10к", "Твердый"));
		libraryLenina.addBookToLibraryList(new Book(6, "Анна Каренина", "Гоголь Н.В", "Москва", 1984, 742, "3р50к", "Твердый"));

		view.showLibrary(libraryLenina.booksList);
		

		System.out.println("\nКниги автора:");

		List<Book> listSortByAuthor = logic.getListByAuthor(libraryLenina.booksList, "Гоголь Н.В");
		
		view.showLibrary(listSortByAuthor);

		System.out.println("\nКниги издательства:");

		List<Book> listSortByPublishingHouse = logic.getListByPublishingHouse(libraryLenina.booksList, "Питер");
		
		view.showLibrary(listSortByPublishingHouse);

		System.out.println("\nКниги выпущенные после заданного года:");

		List<Book> listSortByYear = logic.getListByYear(libraryLenina.booksList, 1984);
		
		view.showLibrary(listSortByYear);
	}
}
