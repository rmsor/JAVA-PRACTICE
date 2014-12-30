package lib;

import java.util.ArrayList;
import java.util.List;

public class Book extends Publication {
    private String ISBN;
    private List<Author> authors;

    public Book(String title,String ISBN,List<Author> authors) {
        super(title);
        this.ISBN = ISBN;
        this.authors=authors;
    }
    public Book(String ISBN,String title) {
        super(title);
        this.ISBN = ISBN;
    }
    public void addAuthor(Author auth){
        authors.add(auth);
    }
    public String getISBN() {
        return ISBN;
    }
    
}
