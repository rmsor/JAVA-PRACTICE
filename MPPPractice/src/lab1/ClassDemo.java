package lab1;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author rmsor_000
 */
public class ClassDemo {
    public static void main(String[] args) throws ParseException{
        Company c1=new Company("Smart Technologies");
        Company c2=new Company("Infotech");
        Company c3=new Company("IBM");
        System.out.println("Company Name: "+c1.getName());
        c1.print();
        c2.print();
        c3.print();
        Department d1=new Department("Sales","Chicago");
        Department d2=new Department("Development","Fairfield");
        Department d3=new Department("Marketing","LA");
        System.out.println("Department Name: "+d1.getName());
        System.out.println("Department Name: "+d1.getLocation());
        d1.print();
        d2.print();
        d3.print();
        SimpleDateFormat st=new SimpleDateFormat("YYYY-MM-DD");
        Date da1=st.parse("1922-10-21");
        Date da2=st.parse("1888-02-12");
        Employee e1= new Employee("Raj","Kumar","Pathak",da1,"7-77-55-589",54000);
        Employee e2= new Employee("Hari","Narayan","Bhatta",da2,"7-34-55-589",22000);
        e1.print();
        e2.print();
        Position p1=new Position("Project Manager","PM");
        Position p2=new Position("Sales Manager","SM");
        Position p3=new Position("Senior Developer","SD");
        p1.print();
        p2.print();
        p3.print();
    }
}
