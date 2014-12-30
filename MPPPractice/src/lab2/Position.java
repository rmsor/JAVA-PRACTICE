package lab2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author rmsor_000
 */
public class Position {

    private String title;
    private String description;
    private Employee emp;
    private Position superior;
    private ArrayList<Position> inferior = new ArrayList<Position>();
    private boolean isDeptHead=false;
    private Department dept;
    
    public Position(String title, String description,Position sup,boolean isDeptHead,Department dept) {
        this.title = title;
        this.description = description;
        this.isDeptHead=isDeptHead;
        this.dept=dept;
        if(sup!=null){
            setSuperior(sup);
        }
    }

    public boolean isIsDeptHead() {
        return isDeptHead;
    }

    public void setIsDeptHead(boolean isDeptHead) {
        this.isDeptHead = isDeptHead;
    }

    public void setSuperior(Position p) {
        this.superior = p;
        p.addInferior(this);
    }

    public void addInferior(Position p) {
        inferior.add(p);
    }
    public Position getSuperior(){
        if(superior==null)
            return null;
        else
            return superior;
    }
    
    public String printDownLine(Position p,String builder,int spaces) {
        builder+=TabSpace.space(spaces) + p.title;
        if(p.emp !=null)
            builder+=": ("+p.emp.getFirstName()+" "+p.emp.getMiddleInitial()+" "+p.emp.getLastName()+")";
        builder+="\n";
        if (p.inferior.size() > 0) {
            spaces++;
            Iterator it=p.inferior.listIterator();
            while(it.hasNext()){
                Position ps=(Position)it.next();
                builder=printDownLine(ps,builder,spaces);
            }
        }
        return builder;
    }

    public Employee getEmp() {
        return emp;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
        this.emp.setPs(this);
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println("\t\t------------------Position Details------------------");
        System.out.println("\t\tTitle: " + title);
        System.out.println("\t\tDescription: " + description);
        if (emp != null) //System.out.println("\t\tEmployee: "+emp.getFirstName()+" "+emp.getMiddleInitial()+" "+emp.getLastName());
        {
            emp.print();
        }
        // System.out.println("\t\t------------------------------------------------------");
    }

    public double getSalary() {
        if (emp != null) {
            return emp.getSalary();
        } else {
            return 0;
        }
    }

}
