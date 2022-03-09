package hh.swd20.Bookstore.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long categid;
	private String name;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
	private List<Book> books;

	public Category() {}

	public Category(String name) {
		super();
		this.name = name;
	}

	public Long getCategid() {
		return categid;
	}
	public String getName() {
		return name;
	}
	public void setCategid(Long categid) {
		this.categid = categid;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	@Override
	public String toString() {
		return "Category [categid=" + categid + ", name=" + name + "]";
	}
}
