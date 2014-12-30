package assignment4;

import java.util.Random;

public class Employee {
	private String firstName,lastName,address,empid;
	private double salary;
	private static String randomId;
	
	public Employee(String fn, String ln, String add, double sal){
		firstName=fn;
		lastName=ln;
		address=add;
		salary=sal;
		empid=Employee.createEmpId();
	}
	
	public static String createEmpId(){
		Random rm=new Random();
		randomId=String.valueOf(rm.nextInt((999999 - 111111) + 1) + 111111);
		return randomId;
	}
	public void showReport(){
		System.out.println("First Name: "+firstName);
		System.out.println("Last Name: "+lastName);
		System.out.println("Address: "+address);
		System.out.println("Employee Id: "+empid);
		System.out.println("Salary: "+salary);
		System.out.println("");
	}
	
	public static void main(String[] args) {
		Employee emp=new Employee("Ram","Pathak","NEP",3430.33);
		emp.showReport();
		Employee emp1=new Employee("Shyam","Pathak","NEP",5000.33);
		emp1.showReport();
		
	}

}
