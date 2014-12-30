package assignment1;

import java.util.Scanner;

public class GenerateUserName {

	public static void main(String[] args) {
		Scanner nm=new Scanner(System.in);
		System.out.println("Enter First Name");
		String firstName=nm.nextLine();
		System.out.println("Enter Second Name");
		String lastName=nm.nextLine();
		nm.close();
		String userName="";
		if(lastName.length()<5){
			System.out.println("Last Name Must be at Least 5 characters");
		}else{
			int rand=900000 + (int)(Math.random()*999999); 
			//userName.concat(firstName.substring(0,1));
			//userName.concat(lastName.substring(0,5));
			//userName.concat(String.valueOf(rand));
			userName=firstName.substring(0,1)+lastName.substring(0,5)+rand;
			System.out.println("User Name is "+ userName);
		}
		

	}

}
