package lesson2democode;

import java.util.Date;

public class FormatOutput {
	public static void main(String args[]) {
		System.out.printf("You owe me $%f \n", 195.50);		
		System.out.printf("You owe me $%.2f \n", 195.5076);
		System.out.printf("You owe me $%7.2f \n", 195.50);
		String name = "Bob";
		int age = 30;
		System.out.printf("Happy birthday %s. I can't believe you're %d.",name,age);
		String oweMe = String.format("You owe me %.2f dollars", 196f);
		String oweMe2 = String.format("You owe me %d dollars", 196);
		System.out.println(oweMe);
		System.out.println(oweMe2);
		String date = String.format("Today's date: %tF", new Date());
		System.out.println(date);
		String date1 = String.format("Today's date: %tc", new Date());
		System.out.println(date1);
		int x = 'K';
		int x1 = 123;
		System.out.printf("Hexa Decimal Value of x: %x\n",x);
		System.out.printf("Hexa Decimal Value of x1: %x",x1);
		System.out.printf("\n%3d #%2s #%7.2f\n", 1234, "Java", 51.6653);
	}
}
