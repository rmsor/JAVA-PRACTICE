package assignment6;

import java.util.Date;
import java.util.Scanner;

class DeptEmployee {
	String empName;
	Date hireDate;
	Double salary;
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}	
	public double computeSalary(){
		return salary;
	}
}
class Professor extends DeptEmployee{
	
	int numberOfPublications;
	
	public Professor(double sal){
		numberOfPublications=10;
		salary=sal;
	}
	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}
}
class Secretary extends DeptEmployee{
	int overTimeHours;
	
	public Secretary(double sal){
		overTimeHours=200;
		salary=sal;
	}
	
	public int getOverTimeHours() {
		return overTimeHours;
	}

	public void setOverTimeHours(int overTimeHours) {
		this.overTimeHours = overTimeHours;
	}
	@Override
	public double computeSalary(){
		return salary+(12*overTimeHours);
	}
}
public class Main {
	public static void main(String[] args){
		Professor pf1=new Professor(1500.25);
		Professor pf2=new Professor(1300);
		Professor pf3=new Professor(1400.25);
		Secretary sc1=new Secretary(2500);
		Secretary sc2=new Secretary(1800);
		
		DeptEmployee[] dp=new DeptEmployee[5];
		
		dp[0]=pf1;
		dp[1]=pf2;
		dp[2]=pf3;
		dp[3]=sc1;
		dp[4]=sc2;
		
		Scanner sn=new Scanner(System.in);
		System.out.println("Do you want to sum all the salaries ?");
		char input=sn.nextLine().toUpperCase().charAt(0);
		if(input=='Y'){
			double totalSal=0;
			for(int i=0;i<5;i++){
				totalSal+=dp[i].computeSalary();
			}
			System.out.println("sum all the salaries is: "+totalSal);
		}
		sn.close();
		
	}
}
