package lib;

import java.util.HashMap;

public class Author extends Person {
    private String credentials;
    private String shortBio;
    private HashMap<String,Book> books;
    
    public Author(String firstName,String lastName, String phone,String credentials, String shortBio,String street, String city, String state, String zip) {
        super(firstName, lastName, phone);
        Address add=new Address(street,city,state,zip);
        add.setPer(this);
        this.addAddress(add);
        this.credentials = credentials;
        this.shortBio = shortBio;
        books=new HashMap();
    }
    public void addAddress(Address add){
        setAddr(add);
    }
    public void addBook(Book bk){
        books.put(bk.getTitle(),bk);
    }
    public String getCredentials() {
        return credentials;
    }

    public String getShortBio() {
        return shortBio;
    }
    
}
