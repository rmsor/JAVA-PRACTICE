package assignment2;

import java.util.Scanner;

public class countOddEven {
	
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter A Number:");
		int n=input.nextInt();
		int x=0,countO=0,countE=0,countZ=0;
		while( n != 0 )
		{
		    x=n%10;
		    n = n/10;
		    if(x%2==0 && x!=0){
		    	countE++;
		    }
		    if(x%2==1){
		    	countO++;
		    }
		    if(x==0){
		    	countZ++;
		    }
		}
		input.close();
	    System.out.println("Odd Digits"+countO);
	    System.out.println("Even Digits"+countE);
	    System.out.println("Zero Digits"+countZ);
		
	}
}
