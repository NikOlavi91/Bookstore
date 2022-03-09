package hh.swd20.Bookstore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import hh.swd20.Bookstore.domain.Book;
import hh.swd20.Bookstore.domain.BookRepository;
import hh.swd20.Bookstore.domain.Category;
import hh.swd20.Bookstore.domain.CategoryRepository;

@SpringBootApplication
public class BookstoreApplication {
	private static final Logger log = LoggerFactory.getLogger(BookstoreApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	@Bean
	public CommandLineRunner bookDemo(BookRepository repository, CategoryRepository crepository) {
		return (args) -> {
			log.info("save a couple of category");
			Category category1 = new Category("Sotaromaanit");
			crepository.save(category1);
			Category category2 = new Category("Tietokirjat");
			crepository.save(category2);
			
			repository.save(new Book("Taistelutoverit","Stephen E. Ambrose", 2011, "978-951-1-2663-1",12.99,category1));
			repository.save(new Book("Kuolema telaketjuilla", "Sven Hassel", 2006, "951-20-7270-1",5,category2));
			
			
			log.info("fetch all category");
			for (Category category : crepository.findAll()) {
				log.info(category.toString());
			}

		};
	}
}
