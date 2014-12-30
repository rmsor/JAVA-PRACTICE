package lib;
import java.util.ArrayList;
import java.util.Date;
public class Member extends Person{
    private String memberNo;
    private ArrayList<Loan> loans=new ArrayList<Loan>();
    private ArrayList<Reservation> reservations=new ArrayList<Reservation>();
    
    public Member(String memberNo,String firstName,String lastName, String phone,String street, String city, String state, String zip) {
        super(firstName, lastName, phone);
        Address add=new Address(street,city,state,zip);
        add.setPer(this);
        this.addAddress(add);
        this.memberNo = memberNo;
    }

    public String getMemberNo() {
        return memberNo;
    }
    public void addAddress(Address add){
        setAddr(add);
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }
    
    public Reservation reserve(Publication pb,Date statusDate){
        Reservation res=new Reservation(this,pb);
        res.setStatus("pending");
        res.setStatusDate(statusDate);
        pb.addReservation(res);
        reservations.add(res);
        return res;
    }
    public void loan(Copy cp,Date checkOutDate){
        Loan ln=new Loan(cp,this);
        ln.setCheckOutDate(checkOutDate); 
        loans.add(ln);
        //cp.setStatus("loaned");
    }
    public void returnIt(Copy cp, Date returnDate){
        cp.returnIt(returnDate);
    }
    public void cancelReservation(Reservation res){
        res.cancel();
    }
    public void pickupReservation(Reservation res){
        res.pickup();
        loan(res.getCp(),new Date());
    }

    public ArrayList<Loan> getLoans() {
        return loans;
    }
    
}
