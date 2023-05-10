package com.book;

abstract public class Book {
	private String title;
	private String author;
	private String publisher;
	protected double price;
	protected int pages;
	public Book() {
		
	}
	
	public Book(String title, String author, String publisher, double price, int pages) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.pages = pages;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
	
	@Override
	public String toString() {
		return String.format("%-10s%-10s%-10s%-10.2f%-10d", this.title,this.author,this.publisher,this.price,this.pages );
	}

	public abstract void calculatePrice();
	
}
