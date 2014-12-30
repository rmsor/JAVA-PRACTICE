package lab4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author rmsor_000
 */
class Salaried extends Employee{
    private double salary;

    public Salaried(double salary) {
        super("SALARY");
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }  
    
    public double calcGrossPay(DateRange dr){
        return salary;
    }
}
