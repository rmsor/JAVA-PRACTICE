package lesson2democode;

import java.util.Scanner;

public class ScanerInput {
	public static void main (String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Type your name: ");
		String name = in.nextLine();
        System.out.println("you wrote: "+name);
		System.out.print("Type your age: ");
        int age = in.nextInt();                 
		System.out.println("your age: "+age);
		System.out.print("Type your Salary: ");
		double salary = in.nextDouble();                 
		System.out.println("your Salary: "+ salary );
				
	}
}
