package lab4;

import java.text.ParseException;

/**
 *
 * @author rmsor_000
 */
public class Application {
    public static void main(String[] args) throws ParseException{
        Hourly hourly=new Hourly(30,9);
        Paycheck pc=hourly.calcCompensation(2014,1);
        hourly.print();
        pc.print();
        Salaried salary=new Salaried(3000);
        Paycheck pc1=salary.calcCompensation(2013,5);
        salary.print();
        pc1.print();
        Commissioned comm=new Commissioned(3000,5);
        Order ord=new Order("00ORD13","2012-07-05",5000, (Commissioned) comm);
        comm.addOrder(ord);
        Paycheck pc2=comm.calcCompensation(2012,7);
        comm.print();
        pc2.print();
        // project sample
        Project prj=new Project("Library Management System","2014-12-10","2014-12-22");
        prj.addCoding("Book Checkout Section",2,500,0.5);
        prj.addCoding("Book Return Section",1,100,0.25);
        prj.addTesting("Book Checkout Section Testing",1,7,55);
        prj.addTesting("Book Return Section Testing",1,10,55);
        System.out.println("Total Project Cost: $"+prj.getCost());
    }
}
