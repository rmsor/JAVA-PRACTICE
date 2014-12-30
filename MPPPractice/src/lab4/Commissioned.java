package lab4;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author rmsor_000
 */
class Commissioned extends Employee{
    private double commission;
    private double baseSalary;
    
    private ArrayList<Order> orders;

    public Commissioned(double baseSalary, double commission) {
        super("COMM");
        this.commission = commission;
        this.baseSalary = baseSalary;
        orders=new ArrayList<Order>();
    }
    public void addOrder(Order od){
        orders.add(od);
    }
    public double getCommission() {
        return commission;
    }

    public double getBaseSalary() {
        return baseSalary;
    }
    
     public double calcGrossPay(DateRange dr){
        double totalCommission=0.00;
        Iterator it=orders.iterator();
        while(it.hasNext()){
            Order or=(Order)it.next();
            totalCommission+=(or.getOrderAmount()*commission)/100;
        }
        return baseSalary+totalCommission;
    }
}
