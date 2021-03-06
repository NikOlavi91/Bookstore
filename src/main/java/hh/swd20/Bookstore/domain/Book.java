package hh.swd20.Bookstore.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String author;
	private int year;
	private String isbn;
	private double price;

	public Book() {
		super();
		this.id = null;
		this.title = null;
		this.author = null;
		this.year = 0;
		this.isbn = null;
		this.price = 0;

	}

	@ManyToOne
	@JsonIgnoreProperties("books")
	@JoinColumn(name = "categid")
	private Category category;

	public Book(String title, String author, int year, String isbn, double price, Category category) {
		super();
		this.title = title;
		this.author = author;
		this.year = year;
		this.isbn = isbn;
		this.price = price;
		this.category = category;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	// @param title the title to set
	public void setTitle(String title) {
		this.title = title;
	}

	// @param author the author to set
	public void setAuthor(String author) {
		this.author = author;
	}

	// @param year the year to set
	public void setYear(int year) {
		this.year = year;
	}

	// @param isbn the isbn to set
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	// @param price the price to set
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

	public String getIsbn() {
		return isbn;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		if (this.category!=null) 
		return "Book [id=" + id + "title=" + title + ", author=" + author + ", year=" + year + ", isbn=" + isbn
				+ ", price=" + price + "category="+this.getCategory()+"]";
	
		else 
			return "Book [id=" + id + "title=" + title + ", author=" + author + ", year=" + year + ", isbn=" + isbn
					+ ", price=" + price + "]";

}
}
