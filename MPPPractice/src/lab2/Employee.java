package lab2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author rmsor_000
 */
public class Employee {
    private String employeeId,firstName,middleInitial,lastName;
    private Date birthDate;
    private String SSN;
    private double salary;
    private static int nextEmpID;
    private Position ps;

    public Employee(String firstName, String middleInitial, String lastName, String birthDate, String SSN, double salary) throws ParseException {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
        SimpleDateFormat st=new SimpleDateFormat("YYYY-MM-DD");
        this.birthDate = st.parse(birthDate);
        this.SSN = SSN;
        this.salary = salary;
        Random rand=new Random();
        nextEmpID=rand.nextInt((159999 - 111111) + 1) + 111111;
        employeeId="EMP_"+String.valueOf(nextEmpID);
    }

    public void setPs(Position ps) {
        this.ps = ps;
    }
    
    public Date getBirthDate() {
        return birthDate;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public String getSSN() {
        return SSN;
    }

    public double getSalary() {
        return salary;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void print(){
        System.out.println("\t\t\t\t....................Employee Details....................");
        System.out.println("\t\t\t\tEmployee ID: "+employeeId);
        System.out.println("\t\t\t\tName: "+firstName+" "+middleInitial+" "+lastName);
        System.out.format("\t\t\t\tBirth Date: %s",birthDate);
        System.out.println("\n\t\t\t\tSSN: "+SSN);
        System.out.println("\t\t\t\tSalary: "+salary);
       // System.out.println("\t\t\t\t.........................................................");
    }
    
}
