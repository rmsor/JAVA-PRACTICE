package lab4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author rmsor_000
 */
abstract class Employee {
    private String empId;
    private static int nextEmpID;
    private HashMap<DateRange,Paycheck> paychecks;
    
    public Employee(String type){
        Random rand=new Random();
        nextEmpID=rand.nextInt((159999 - 111111) + 1) + 111111;
        empId=type+"_"+String.valueOf(nextEmpID);
        paychecks=new HashMap<DateRange,Paycheck>();
    }
    public void print(){
        System.out.println("***************************Employee Details ***************************");
        System.out.println("Employee ID:"+empId);
        
    }
    public  Paycheck calcCompensation(int year,int month) throws ParseException{        
        SimpleDateFormat fm=new SimpleDateFormat("YYYY-mm-dd");
        Date newDate=fm.parse(String.valueOf(year)+"-"+String.valueOf(month)+"-"+"01");
        Date startDate=DateRange.getFirstDayOfMonth(newDate);
        Date endDate=DateRange.getLastDayOfMonth(newDate);
        DateRange dr=new DateRange(startDate,endDate);
        double grossPay=calcGrossPay(dr);
        double fica=grossPay*0.23;
        double state=grossPay*0.05;
        double local=grossPay*0.01;
        double medicare=grossPay*0.03;
        double socialSecurity=grossPay*0.075;
        Paycheck pk=new Paycheck(grossPay,fica,state,local,medicare,socialSecurity,dr.toString(),this);
        paychecks.put(dr,pk);
        return pk;
    }
    
    public abstract double calcGrossPay(DateRange dr);
}
