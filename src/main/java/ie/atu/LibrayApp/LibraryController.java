package ie.atu.LibrayApp;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping(path = "library")
public class LibraryController {

    private final LibraryService libraryService;
    
    LibraryController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @PostMapping("/addBook")
    public void addBook(@RequestBody Book book) {
        libraryService.addBook(book);
    }

    @GetMapping("/allBooks")
    public ArrayList<Book> getBooks() {
        return libraryService.getBooks();
    }
    
}
