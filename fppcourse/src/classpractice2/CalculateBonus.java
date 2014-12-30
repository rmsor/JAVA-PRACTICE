package classpractice2;

import java.util.Scanner;

public class CalculateBonus {
	
	public static void main(String args[]){
		CalculateBonus bn=new CalculateBonus();
		System.out.println("Bonus is :"+bn.returnBonus());
		
	}
	public String returnBonus(){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Sales:");
		float sales=input.nextFloat();
		String bonus="";
		if(sales>10000){
			bonus="Excellent";
		}else if(sales>=7001){
			bonus="Good";
		}else if(sales>=5001){
			bonus="Satisfactory";
		}else{
			bonus="No Bonus";
		}
		input.close();
		return bonus;
	}
}
