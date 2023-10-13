package ie.atu.LibrayApp;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LibraryService {
    
    ArrayList<Book> booklist = new ArrayList<>();
    
    public void addBook(Book book) {
        booklist.add(book);
    }
    
    public ArrayList<Book> getBooks(){
        return new ArrayList<>(booklist);
    }
}
