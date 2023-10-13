package ie.atu.LibrayApp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    private String title;
    private String author;
    private int isbn;
    private int publishedYear;
    
}
