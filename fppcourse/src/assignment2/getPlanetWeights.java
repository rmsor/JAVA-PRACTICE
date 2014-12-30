package assignment2;

import java.util.Scanner;

public class getPlanetWeights {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Your Weight in lbs.:");
		double weight=input.nextDouble();
		System.out.println("Choose a planet to find your weight \n 1.Venus \n 2.Mars\n 3.Jupiter\n 4.Saturn\n 5.Uranus\n 6.Neptune");
		System.out.println("Enter Your Choice:");
		int choice=input.nextInt();
		input.close();
		double planetWeight=0.00;
		switch(choice){
		case 1:
			planetWeight=weight*0.75;
			break;
		case 2:
			planetWeight=weight*0.39;
			break;
		case 3:
			planetWeight=weight*2.65;
			break;
		case 4:
			planetWeight=weight*1.17;
			break;
		case 5:
			planetWeight=weight*1.05;
			break;
		case 6:
			planetWeight=weight*1.13;
			break;
		default:
			break;
				
		}
		System.out.printf("Weight on Select Planet is :%.2f lbs.",planetWeight);
	}

}
