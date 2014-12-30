package lab1;

/**
 *
 * @author rmsor_000
 */
public class Department {
    private String name;
    private String location;

    public Department(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }
    public void print(){
        System.out.println("=================Department Details====================");
        System.out.println("Name: "+name);
        System.out.println("Location: "+location);
        System.out.println("=======================================================");
    }
    
}
