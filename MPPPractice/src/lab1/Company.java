package lab1;
/**
 *
 * @author rmsor_000
 */
public class Company {
    private String name;
    
    public Company(String name){
        this.name=name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void print(){
        System.out.println("=================Company Details====================");
        System.out.println("Name: "+name);
        System.out.println("====================================================");
    }
}
