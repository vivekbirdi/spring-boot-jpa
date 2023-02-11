package com.learning.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
/**
 * BookDao for CRUD operations on M_Book table 
 * @author Vivek Birdi
 *
 */
@Repository
public class BookDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private String initQuery = """
			INSERT INTO M_BOOK (M_BOOK_ID, CODE, NAME, AUTHOR)
					values (1,'1001','Spring Boot','Doggo');
			""";
	
	public void initInsert() {
		jdbcTemplate.update(initQuery);
	}
}
