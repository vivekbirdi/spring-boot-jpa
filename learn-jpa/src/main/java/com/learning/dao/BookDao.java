package com.learning.dao;

import java.sql.ResultSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
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
	
	//2. Dynamic Data Insertion - End
	
	//3. SELECT Query - Single Record - Start
	
	private String selectSingle = "Select * from M_Book WHERE M_Book_ID = ?";
	
	public Book findById(long bookId) {
		RowMapper<Book> rowMapper = this::mapBook; // Custom Row Mapper
//		return jdbcTemplate.queryForObject(selectSingle, new BeanPropertyRowMapper<>(Book.class), bookId);
		return jdbcTemplate.queryForObject(selectSingle, rowMapper, bookId);
	}
	
	private Book mapBook (ResultSet rs, int row) {
		Book book = new Book();
		try {
			book.setBookId(rs.getInt("m_book_id"));
			book.setCode(rs.getString("code"));
			book.setName(rs.getString("name"));
			book.setAuthor(rs.getString("author"));
		}catch (Exception e) {
			e.printStackTrace();
		}
		return book;
	}
	
	//3. Select Query - Single Record - End
	
}
