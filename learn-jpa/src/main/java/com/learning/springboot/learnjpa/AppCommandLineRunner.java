package com.learning.springboot.learnjpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learning.dao.BookDao;
import com.learning.dto.Book;

/**
 * CommandLineRunner for executing code as server gets started.
 * @author Vivek Birdi
 *
 */
@Component
public class AppCommandLineRunner implements CommandLineRunner{

	@Autowired
	private BookDao bookDao;
	
	@Override
	public void run(String... args) throws Exception {
		bookDao.initInsert();
		bookDao.insert(new Book(2, "1002", "Java", "Doggo"));
		bookDao.insert(new Book(3, "1003", "React JS", "Doggo"));
		bookDao.insert(new Book(4, "1004", "Python", "Doggo"));
		
		//1. Select a single example		
		Book book= bookDao.findById(2);
		System.out.println(book);
		//1. end
		
		//2. Select all records example
		List<Book> books =  bookDao.findAll();
		System.out.println(books);
		//2. end
		
	}

}
