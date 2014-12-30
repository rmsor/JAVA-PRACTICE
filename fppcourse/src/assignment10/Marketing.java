package assignment10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Marketing {
	private String employeeName;
	private String productName;
	private double salesAmount;
	
	public Marketing(String empName,String prdName,double salesAmt){
		this.employeeName=empName;
		this.productName=prdName;
		this.salesAmount=salesAmt;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}

	public String getProductName() {
		return productName;
	}
	public void display(){
		System.out.println("Employee Name: "+employeeName+"\tProduct Name: "+productName+"\t Sales Amount: "+salesAmount);
	}
	public static final Comparator NAME=new Comparator(){
		
		public int compare(Object o1,Object o2){
			String name1=((Marketing)o1).getEmployeeName();
			String name2=((Marketing)o2).getEmployeeName();
			return name1.compareTo(name2);
		}
	};
	public static final Comparator PRDNAME=new Comparator(){
		
		public int compare(Object o1,Object o2){
			String prdname1=((Marketing)o1).getProductName();
			String prdname2=((Marketing)o2).getProductName();
			return prdname1.compareTo(prdname2);
		}
	};

	public static void main(String[] args) {
		ArrayList<Marketing> mktList= new ArrayList<Marketing>();
		Marketing mkt1=new Marketing("Ram","MB-2035-SAMSUNG",12);
		Marketing mkt2=new Marketing("Shyam","PC-555-DELL",5);
		Marketing mkt3=new Marketing("Umesh","JK-2035-PHILIPS",12);
		Marketing mkt4=new Marketing("Dinesh","MS-2035-LG",70);
		Marketing mkt5=new Marketing("Tek","MS-2035-LG",70);
		mktList.add(mkt1);
		mktList.add(mkt2);
		mktList.add(mkt3);
		mktList.add(mkt4);
		System.out.println("----------------Sorted by employee Name-------------");
		Collections.sort(mktList, Marketing.NAME);
		Iterator it=mktList.iterator();
		while(it.hasNext()){
			Marketing mkO=(Marketing)it.next();
			mkO.display();
		}
		mktList.remove(2);
		mktList.set(2, mkt5);		
		Collections.sort(mktList, Marketing.PRDNAME);
		System.out.println("----------------Sorted by prod-------------");
		Iterator it1=mktList.iterator();
		while(it1.hasNext()){
			Marketing mkO=(Marketing)it1.next();
			mkO.display();
		}
	}

}
