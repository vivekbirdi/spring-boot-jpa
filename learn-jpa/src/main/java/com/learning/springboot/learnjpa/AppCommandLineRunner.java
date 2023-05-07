package com.learning.springboot.learnjpa;

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
	}

}
