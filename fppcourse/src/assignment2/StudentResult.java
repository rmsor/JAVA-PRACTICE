package assignment2;

import java.util.Scanner;
import static java.lang.System.out;

public class StudentResult {

	public static void main(String args[]){
		StudentResult sr=new StudentResult();
		sr.getResult();
	}
	
	public void getResult(){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Student First Name:");
		out.println("hello");
		
		String firstName=input.nextLine();
		System.out.println("Enter Student Last Name:");
		String lastName=input.nextLine();
		System.out.println("Enter Marks in First Subject:");
		double mark1=input.nextDouble();
		System.out.println("Enter Marks in Second Subject:");
		double mark2=input.nextDouble();
		System.out.println("Enter Marks in Third Subject:");
		double mark3=input.nextDouble();
		System.out.println("Enter Marks in Fourth Subject:");
		double mark4=input.nextDouble();
		double average=(mark1+mark2+mark3+mark4)/4;
		String letter="";
		String remarks="";
		if(average>=90){
			letter="A";
			remarks="Excellent";
		}else if(average>=80){
			letter="B";
			remarks="Very Good";;
		}else if(average>=70){
			letter="C";
			remarks="Fair";;
		}else{
			letter="NC";
			remarks="No Credit";;
		}
		System.out.println("Your FirstName:"+firstName);
		System.out.println("Your LastName:"+lastName);
		System.out.println("Your Marks in Subject1:"+mark1);
		System.out.println("Your Marks in Subject2:"+mark2);
		System.out.println("Your Marks in Subject3:"+mark3);
		System.out.println("Your Marks in Subject4:"+mark4);
		System.out.println("Average:"+average);
		System.out.println("Your Grade:"+letter);
		System.out.println("Your Grade:"+remarks);
		input.close();
	}
}
