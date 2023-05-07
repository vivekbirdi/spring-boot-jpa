package com.learning.dto;

public class Book {

	private long bookId;
	private String code;
	private String name;
	private String author;

	public Book() {
		// Empty
	}
	
	public Book(long bookId, String code, String name, String author) {
		super();
		this.bookId = bookId;
		this.code = code;
		this.name = name;
		this.author = author;
	}
	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", code=" + code + ", name=" + name + ", author=" + author + "]";
	}
	
	
}
