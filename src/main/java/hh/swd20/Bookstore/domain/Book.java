package hh.swd20.Bookstore.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String author;
	private int year;
	private int isbn;
	private double price;
	
	public Book() {
		super();
		this.id=null;
		this.title = null;
		this.author = null;
		this.year = 0;
		this.isbn = 0;
		this.price = 0;
	
	}
	
	public Book(String title, String author, int year, int isbn, double price) {
		super();
		this.title = title;
		this.author = author;
		this.year = year;
		this.isbn = isbn;
		this.price = price;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id=id;
	}
	
	
	//@param title the title to set
	public void setTitle(String title) {
		this.title = title;
	}

	//@param author the author to set	 
	public void setAuthor(String author) {
		this.author = author;
	}
	
	 //@param year the year to set
	public void setYear(int year) {
		this.year = year;
	}

	//@param isbn the isbn to set
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	 //@param price the price to set
	public void setPrice(double price) {
		this.price = price;
	}


	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getYear() {
		return year;
	}


	public int getIsbn() {
		return isbn;
	}


	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Book [id=" +id+ "title=" + title + ", author=" + author + ", year=" + year + ", isbn=" + isbn + ", price=" + price
				+ "]";
	}
	
	
	
	
}
