
package lab2;

import java.text.ParseException;
import java.util.ArrayList;

/**
 *
 * @author rmsor_000
 */
public class TransactionHistory {
    
    Transaction head;
    Transaction tail;
    
    public void addTransaction(String date, double amount) throws ParseException{
        Transaction ts=new Transaction(date,amount,head);
        if(tail==null){
            tail=ts;
        }
        head=ts;
    }
    
    public void print(){
        head.print(head);
    }
}
