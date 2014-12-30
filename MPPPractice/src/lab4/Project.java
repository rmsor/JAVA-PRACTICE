
package lab4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/**
 *
 * @author rmsor_000
 */
public class Project {
    private String name;
    private Date startDate;
    private Date endDate;
    private ArrayList<Task> tsks;

    public Project(String name, String startDate, String endDate) throws ParseException {
        this.name = name;
        SimpleDateFormat fm=new SimpleDateFormat("YYYY-mm-dd");
        this.startDate=fm.parse(startDate);
        this.endDate=fm.parse(endDate);
        tsks=new ArrayList<Task>();
    }
    public void addCoding(String name, int duration,int linesOfCode, double costPerLine){
        Task tsk=new Coding(name,duration,linesOfCode,costPerLine,this);
        tsks.add(tsk);
    }
    public void addTesting (String name, int duration,int numTestCases, double costPerTestCase){
        Task tsk=new Testing(name,duration,numTestCases,costPerTestCase,this);
        tsks.add(tsk);
    }
    public Date getEndDate() {
        return endDate;
    }

    public String getName() {
        return name;
    }

    public Date getStartDate() {
        return startDate;
    }
    
    public double getCost(){
        double totalCost=0.0;
        Iterator it=tsks.iterator();
        while(it.hasNext()){
            Task tsk=(Task)it.next();
            totalCost+=tsk.calculateCost();
        }
        return totalCost;
    }
}
