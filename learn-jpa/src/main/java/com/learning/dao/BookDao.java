package com.learning.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.learning.dto.Book;
/**
 * BookDao for CRUD operations on M_Book table 
 * @author Vivek Birdi
 *
 */
@Repository
public class BookDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	//1. static data insertion - start
	private String initQuery = """
			INSERT INTO M_BOOK (M_BOOK_ID, CODE, NAME, AUTHOR)
					values (1,'1001','Spring Boot','Doggo');
			""";
	
	public void initInsert() {
		jdbcTemplate.update(initQuery);
	}
	
	//1. static data insertion end
	
	//2. Dynamic Data Insertion - Start
	
	private String dynamicInsertQuery = """
			INSERT INTO M_BOOK (M_BOOK_ID, CODE, NAME, AUTHOR)
					values (?,?,?,?);
			""";
	
	public void insert(Book book) {
		jdbcTemplate.update(dynamicInsertQuery, book.getBookId(), book.getCode(), book.getName(), book.getAuthor());
	}
	
	//2/ Dynamic Data Insertion - End
}
