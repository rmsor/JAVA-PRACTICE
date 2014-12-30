package lesson2democode;

import java.util.Scanner;

public class SimpleIf {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int TARGET = 5000;
		//TARGET=7000;
		Scanner in = new Scanner(System.in);
		System.out.print("Type your Sales Amount : ");
		int sales = in.nextInt();
		if (sales > TARGET)
		{
			System.out.println("You performance is Good");
			System.out.println("You will get Bonus");
		}		
		System.out.println("End");
	 }
}
