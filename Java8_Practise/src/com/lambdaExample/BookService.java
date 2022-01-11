package com.lambdaExample;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

	public List<Book> getListOfBooksInSort() {
		List<Book> books = new BookDAO().getListOfBooks();
		//Collections.sort(books, new MyComparator());
		Collections.sort(books, (o1,o2)->o1.getName().compareTo(o2.getName()));
		return books;
	}

	public static void main(String[] args) {
		System.out.println(new BookService().getListOfBooksInSort());

	}
}

class MyComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
