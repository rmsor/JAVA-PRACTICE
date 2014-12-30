package lib;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;
    private Person per;
    
    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public void setPer(Person per) {
        this.per = per;
    }
    
    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }
    
}
