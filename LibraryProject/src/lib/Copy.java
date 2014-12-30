package lib;
import java.util.ArrayList;
import java.util.Date;
public class Copy {
    private String copyNo;
    private String status;
    private ArrayList<Loan> loans=new ArrayList();
    private Loan loan;
    private ArrayList<Reservation> reser=new ArrayList();
    private Publication pub;
    
    public Copy(String copyNo, String status) {
        this.copyNo = copyNo;
        this.status = status;
    }

    public String getCopyNo() {
        return copyNo;
    }

    public void setLoan(Loan loan) {
        this.loan = loan;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public void setPublication(Publication pub) {
        this.pub = pub;
    }

    public String getStatus() {
        return status;
    }

    public Publication getPublication() {
        return pub;
    }
    
    public void reserve(){
        setStatus("onhold");
    }
    
    public void loan(Loan ln){ 
        loans.add(ln);
        setStatus("loaned");
    }
    
    
    public void returnIt(Date returnDate){
        loan.returned(returnDate);
        Reservation pend=pub.hasPendingReservation();
        if(pend!=null)
            hold(pend);
        else
            setStatus("available");
    }
    public void hold(Reservation pend){
        pend.hold(this);
    }
}
