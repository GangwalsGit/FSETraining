package com.question2;

public class Book {
	String name;
	Author author;
	int pages;
	int cost;
	int bookNo;
	public Book(String name, Author author, int pages, int cost, int bookNo) {
		super();
		this.name = name;
		this.author = author;
		this.pages = pages;
		this.cost = cost;
		this.bookNo = bookNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

}
