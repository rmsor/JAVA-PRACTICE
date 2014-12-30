package lab2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author rmsor_000
 */
public class Company {

    private String name;
    private ArrayList<Department> dept;

    public Company(String name) {
        this.name = name;
        dept = new ArrayList<Department>();
    }

    public void addDepartment(String name, String location) {
        dept.add(new Department(name, location,this));
    }

    public void removeDepartment(String name) {
        Department dp = searchDept(name);
        if (dp == null) {
            System.out.println("Department not found");
        } else {
            dept.remove(dp);
        }
    }

    public Department searchDept(String name) {
        Iterator it = dept.listIterator();
        while (it.hasNext()) {
            Department dp = (Department) it.next();
            if (name.equals(dp.getName())) {
                return dp;
            }
        }
        return null;
    }

    public Position addPosition(String deptName, String title, String description,Position sup,boolean isDeptHead) {
        Department dp = searchDept(deptName);
        if (dp == null) {
            System.out.println("Department not found");
        } else {
            return dp.addPosition(title,description,sup,isDeptHead);
        }
        return null;
    }
    public void removePosition(String deptName, String title) {
        Department dp = searchDept(deptName);
        if (dp == null) {
            System.out.println("Department not found");
        } else {
            dp.removePosition(title);
        }
    }
    public void setPosition(String deptName,String title,Employee emp){
        Department dp = searchDept(deptName);
        if (dp == null) {
            System.out.println("Department not found");
        } else {
            dp.setPosition(title,emp);
        } 
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void print() {
        System.out.println("=================Company Details====================");
        System.out.println("Name: " + name);
        Iterator it = dept.listIterator();
        while (it.hasNext()) {
            Department dp = (Department) it.next();
            dp.print();
        }
        System.out.println("====================================================");
    }
    public double getSalary(){
        double totalSal=0.00;
        Iterator it = dept.listIterator();
        while (it.hasNext()) {
            Department dp = (Department) it.next();
            totalSal+=dp.getSalary();
        }
        return totalSal;
    }
     public Position getTopExecutive(){
        Iterator it = dept.listIterator();
        while (it.hasNext()) {
            Department dp = (Department) it.next();
            Position ps=dp.getDepartmentHead(dp);
            if(ps!=null){
                if(ps.getSuperior()==null){
                    return ps;
                }
            }
        }
        return null;
    }
    public void printReportingHierarchy(){
        Position ps=getTopExecutive();
        String builder = "^^^^^^^^^^^^^^EMPLOYEE HIEARCY^^^^^^^^^^^^^^^^\n";
        System.out.println(ps.printDownLine(ps,builder,0));
        System.out.println("^^^^^^^^^^^^^^EMPLOYEE HIEARCY ENDS^^^^^^^^^^^^^^^^");
    }
}
