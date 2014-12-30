package lib;

import java.util.Date;

public class Reservation {
    private String status;
    private Date statusDate;
    private Copy cp;
    private Member mb;
    private Publication pub;
    
    public Reservation(Member mb,Publication pb) {
        this.mb = mb;
        this.pub = pb;
    }

    public String getStatus() {
        return status;
    }

    public Member getMb() {
        return mb;
    }
    
    public Copy getCp() {
        return cp;
    }

    public void setCp(Copy cp) {
        this.cp = cp;
    }
    
    public Date getStatusDate() {
        return statusDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
    }

    public Publication getPub() {
        return pub;
    }
    
    
    public void cancel(){
        setStatus("canceled");
        setStatusDate(new Date());
        if(cp!=null && cp.getStatus().equalsIgnoreCase("onhold")){
            cp.setStatus("Available");
        }
        pub.removeReservation(this);
    }
    public void hold(Copy cp){
        setStatus("onhold");
        setStatusDate(new Date());
        setCp(cp);
    }
    public void pickup(){
        setStatus("fulfilled");
        setStatusDate(new Date());        
    }
    
}
