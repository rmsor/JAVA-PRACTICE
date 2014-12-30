package lab4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author rmsor_000
 */
class Order {
    private String orderNo;
    private Date orderDate;
    private double orderAmount;
    private Commissioned comm;

    public Order(String orderNo, String orderDate, double orderAmount,Commissioned comm) throws ParseException {
        this.orderNo = orderNo;
        SimpleDateFormat fm=new SimpleDateFormat("YYYY-mm-dd");
        this.orderDate=fm.parse(orderDate);
        this.orderAmount = orderAmount;
        this.comm=comm;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public String getOrderNo() {
        return orderNo;
    }
    
}
