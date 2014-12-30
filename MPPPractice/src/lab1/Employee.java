package lab1;

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

    public Employee(String firstName, String middleInitial, String lastName, Date birthDate, String SSN, double salary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.SSN = SSN;
        this.salary = salary;
        Random rand=new Random();
        nextEmpID=rand.nextInt((159999 - 111111) + 1) + 111111;
        employeeId="EMP_"+String.valueOf(nextEmpID);
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
        System.out.println("=================Employee Details====================");
        System.out.println("Employee ID: "+employeeId);
        System.out.println("Name: "+firstName+" "+middleInitial+" "+lastName);
        System.out.format("Birth Date: %s",birthDate);
        System.out.println("SSN: "+SSN);
        System.out.println("Salary: "+salary);
        System.out.println("======================================================");
    }
    
}
