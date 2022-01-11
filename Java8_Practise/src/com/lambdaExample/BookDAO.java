package com.lambdaExample;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
	
	public List<Book> getListOfBooks(){
		List<Book> books = new ArrayList<Book>();
		books.add(new Book(101,"spring",400));
		books.add(new Book(102,"hibernate",120));
		books.add(new Book(103,"spring Boot",221));
		books.add(new Book(104,"microservice",320));
		return books;
	}

}
