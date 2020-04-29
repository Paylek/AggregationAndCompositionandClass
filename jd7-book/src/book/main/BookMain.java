package book.main;

import java.util.List;

import book.bean.Book;
import book.bean.Library;
import book.logic.BookLogic;
import book.view.BookView;

public class BookMain {
	public static void main(String[] args) {
		Library libraryLenina = new Library("������");
		BookLogic logic = new BookLogic();
		BookView view = new BookView();

		libraryLenina.addBookToLibraryList(new Book(0, "�������� � �������������     ", "������ �.�", "�����", 1975, 532, "2�50�", "�������"));
		libraryLenina.addBookToLibraryList(new Book(1, "������ ���", "������� �.�", "������", 1965, 1523, "5�50�", "�������"));
		libraryLenina.addBookToLibraryList(new Book(2, "������� ������", "������ �.�", "�����", 1973, 445, "2�50�", "������"));
		libraryLenina.addBookToLibraryList(new Book(3, "1984", "�������� �.�", "�����", 1992, 600, "3�23�", "�������"));
		libraryLenina.addBookToLibraryList(new Book(4, "�����    ", "������ �.�", "�����", 1998, 286, "1�40�", "������"));
		libraryLenina.addBookToLibraryList(new Book(5, "������������ � ���������", "����������� �.�", "�����", 1969, 756, "3�10�", "�������"));
		libraryLenina.addBookToLibraryList(new Book(6, "���� ��������", "������ �.�", "������", 1984, 742, "3�50�", "�������"));

		view.showLibrary(libraryLenina.booksList);
		

		System.out.println("\n����� ������:");

		List<Book> listSortByAuthor = logic.getListByAuthor(libraryLenina.booksList, "������ �.�");
		
		view.showLibrary(listSortByAuthor);

		System.out.println("\n����� ������������:");

		List<Book> listSortByPublishingHouse = logic.getListByPublishingHouse(libraryLenina.booksList, "�����");
		
		view.showLibrary(listSortByPublishingHouse);

		System.out.println("\n����� ���������� ����� ��������� ����:");

		List<Book> listSortByYear = logic.getListByYear(libraryLenina.booksList, 1984);
		
		view.showLibrary(listSortByYear);
	}
}
