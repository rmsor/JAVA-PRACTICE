package lib;

import java.util.ArrayList;
import java.util.Iterator;

public class Publication {

    private String title;
    private ArrayList<Copy> copy = new ArrayList<Copy>();
    private ArrayList<Reservation> reservations = new ArrayList<Reservation>();

    public Publication(String title) {
        this.title = title;
    }

    public void addReservation(Reservation rs) {
        reservations.add(rs);
    }

    public void removeReservation(Reservation rs) {
        reservations.remove(rs);
    }

    public Reservation hasPendingReservation() {
        Iterator it = reservations.iterator();
        while (it.hasNext()) {
            Reservation res = (Reservation) it.next();
            if (res.getStatus() == "pending") {
                return res;
            }
        }
        return null;
    }

    public String getTitle() {
        return title;
    }

    public void addCopy(Copy cp) {
        copy.add(cp);
    }

    public ArrayList<Copy> getCopy() {
        return copy;
    }
    
}
