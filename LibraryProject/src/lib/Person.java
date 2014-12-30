package lib;

public class Person {
    String firstName;
    String lastName;
    String phone;
    private Address addr;

    public Person(String firstName, String lastName, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }
    
    public String getLastName() {
        return lastName;
    }
    public String getFullName(){
        return firstName+" "+lastName;
    }
    public String getPhone() {
        return phone;
    }
    
}
