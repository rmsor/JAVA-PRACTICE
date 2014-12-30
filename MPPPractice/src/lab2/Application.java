package lab2;

import java.text.ParseException;
/**
 *
 * @author rmsor_000
 */
public class Application {
    public static void main(String[] args) throws ParseException{
        /***********************create company****************/
        Company c1=new Company("Smart Technologies");
        /***********************create departments****************/
        c1.addDepartment("Sales","Chicago");
        c1.addDepartment("Admin","Fairfield");
        c1.addDepartment("Development","Fairfield");
        /***********************add positions to departments****************/
        Position ceo=c1.addPosition("Admin","Chief Executive Officer","CEO",null,true);
        Position gm=c1.addPosition("Admin","General Manager","gm",ceo,false);
        
        Position sm=c1.addPosition("Sales","Sales Manager","SM",ceo,true);
        Position so=c1.addPosition("Sales","Sales Officer","SO",sm,false);
        Position sr=c1.addPosition("Sales","Sales Representative","SR",so,false);
        
        Position pm=c1.addPosition("Development","Project Manager","PM",ceo,true);
        Position tl=c1.addPosition("Development","Tech Lead","TL",pm,false);
        Position sd=c1.addPosition("Development","Senior Developer","SD",tl,false);
        
        /***********************create employees****************/
        Employee e1= new Employee("Raj","Kumar","Pathak","1922-10-21","7-77-55-589",54000);
        Employee e2= new Employee("Hari","Narayan","Bhatta","1878-12-3","80-55-589",22000);
        Employee e3= new Employee("John","","Doe","1888-6-8","50-55-229",15300);
        Employee e4= new Employee("Jac","","Nicolson","1868-04-2","34-55-589",65000);
        Employee e54= new Employee("Thomas","John","Milton","1878-08-12","34-77-589",125000);
        
        /***********************Add employees to positions****************/
        c1.setPosition("Admin","Chief Executive Officer",e54);
        c1.setPosition("Sales","Sales Manager",e1);
        c1.setPosition("Sales","Sales Representative",e2);
        c1.setPosition("Development","Tech Lead",e3);
        c1.setPosition("Development","Senior Developer",e4);
        
        c1.print();
        System.out.println("");
        System.out.println("Total Salary:"+c1.getSalary());
        System.out.println("");
        c1.printReportingHierarchy();
        System.out.println("....................Transaction History.............");
        TransactionHistory ts=new TransactionHistory();
        ts.addTransaction("2013-09-07", 15000);
        ts.addTransaction("2014-05-06", 70000);
        ts.addTransaction("2014-08-06", 80000);
        ts.print();
    }
}
