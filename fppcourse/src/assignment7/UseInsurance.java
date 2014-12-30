package assignment7;

import java.util.Scanner;

abstract class Insurance{
	String insuranceType;
	double monthlyPrice;
	
	Insurance(String type){
		insuranceType=type;
	}

	public String getInsuranceType() {
		return insuranceType;
	}

	public double getMonthlyPrice() {
		return monthlyPrice;
	}
	public abstract void setCost();
	public abstract void display();
}

class Health extends Insurance{
	
	public Health(){
		super("Health");
	}
	
	public void setCost(){
		monthlyPrice=196;
	}
	public void display(){
		System.out.println("Type of Insurance is:"+insuranceType);
		System.out.println("Monthly Fee of Health Insurance is: $"+monthlyPrice);
	}
}
class Life extends Insurance{
	
	public Life(){
		super("Life");
	}
	
	public void setCost(){
		monthlyPrice=36;
	}
	public void display(){
		System.out.println("Type of Insurance is:"+insuranceType);
		System.out.println("Monthly Fee of Life Insurance is: $"+monthlyPrice);
	}
}

public class UseInsurance {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter type of Insurance:(Life/Health)");
		String insType=input.nextLine();
		if(insType.toLowerCase().equals("life")){
			Life nl=new Life();
			nl.setCost();
			nl.display();
		}else if(insType.toLowerCase().equals("health")){
			Health nl=new Health();
			nl.setCost();
			nl.display();
		}else{
			System.out.println("Invalid Selection !!");
		}
		input.close();
	}

}
