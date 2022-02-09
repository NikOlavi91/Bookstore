package hh.swd20.Bookstore.web;

 
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import hh.swd20.Bookstore.domain.Book;

@Controller
public class BookController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String aloitusSivu(Model model){
		List<Book> books = new ArrayList<Book>();
		books.add(new Book("Taistelutoverit","Stephen E. Ambrose", 2011, 978-951-1-2663-1,12.99));
		model.addAttribute("books", books);
		return "index";
	}
}