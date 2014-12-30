package lab2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author rmsor_000
 */
public class Department {
    private String name;
    private String location;
    private ArrayList<Position> pos;
    private Company company;

    public Department(String name, String location,Company company) {
        this.name = name;
        this.location = location;
        pos=new ArrayList<Position>();
        this.company=company;
    }
     public Position addPosition(String title, String description,Position sup,boolean isDeptHead) {
        Position ps=new Position(title,description,sup,isDeptHead,this);
        pos.add(ps);
        return ps;
    }
     public Position searchPosition(String title) {
        Iterator it = pos.listIterator();
        while (it.hasNext()) {
            Position ps = (Position) it.next();
            if (title.equals(ps.getTitle())) {
                return ps;
            }
        }
        return null;
    }
    public void removePosition(String title){
        Position ps=searchPosition(title);
        if(ps==null){
            pos.remove(ps);
        }else{
            System.out.println("Position Not found");
        }
    }
    public void setPosition(String title,Employee emp){
        Position ps = searchPosition(title);
        if (ps == null) {
            System.out.println("Position not found");
        } else {
            ps.setEmp(emp);
        } 
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }
    public void print(){
        System.out.println("\t********************Department Details******************************");
        System.out.println("\tName: "+name);
        System.out.println("\tLocation: "+location);
        Iterator it = pos.listIterator();
        while (it.hasNext()) {
            Position ps = (Position) it.next();
            ps.print();        }
        //System.out.println("\t************************************************************");
    }
    public double getSalary(){
        double totalSal=0.00;
        Iterator it = pos.listIterator();
        while (it.hasNext()) {
            Position ps = (Position) it.next();
            totalSal+=ps.getSalary();
        }
        return totalSal;
    }
   
    public Position getDepartmentHead(Department dp){
        Iterator it = dp.pos.listIterator();
        while (it.hasNext()) {
            Position ps = (Position) it.next();
            if(ps.isIsDeptHead()==true){
                return ps;
            }
        }
        return null;
    }
    
    
}
