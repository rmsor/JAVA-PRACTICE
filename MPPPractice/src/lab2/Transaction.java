
package lab2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author rmsor_000
 */
public class Transaction {
    private Date date;
    private double amount;
    private Transaction next;
    
    public Transaction(String date, double amount,Transaction next) throws ParseException {
        SimpleDateFormat st=new SimpleDateFormat("YYYY-MM-DD");
        this.date = st.parse(date);
        this.amount = amount;
        this.next=next;
    }
    
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    public void print(Transaction tn){
        System.out.println("-------------Transaction Details-----------------");
        System.out.println("Date: "+tn.date);
        System.out.println("Amount: "+tn.amount);
        System.out.println("-------------------------------------------------");
        if(tn.next !=null){
            print(tn.next);
        }
    }
}
