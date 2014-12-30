package lib;

import java.util.Date;

public class Loan {
    private Date checkOutDate;
    private Date returnDate;
    private Copy copy;
    private Member member;
    
    public Loan(Copy cp,Member mb) {
        this.copy = cp;
        cp.setLoan(this);
        this.member = mb;
    }
    
    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
        copy.loan(this);  
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public void setCopy(Copy copy) {
        this.copy = copy;
    }
    public Date getReturnDate() {
        return returnDate;
    }
    
    public void returned(Date returnDate){
        setReturnDate(returnDate);
    }

    public Copy getCopy() {
        return copy;
    }
    
}
