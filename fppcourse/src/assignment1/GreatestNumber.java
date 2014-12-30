package assignment1;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		GreatestNumber gn=new GreatestNumber();
		Scanner db=new Scanner(System.in);
		System.out.println("Enter First Number:");
		int firstN=db.nextInt();
		System.out.println("Enter Second Number:");
		int secN=db.nextInt();
		System.out.println("Enter Third Number:");
		int thirdN=db.nextInt();
		db.close();		
		int grstn=firstN>secN && firstN>thirdN ? firstN:secN>firstN && secN>thirdN ?secN : thirdN;
		System.out.println("Greatest Number is :"+grstn);
	}
//	public int getNumber(){
//		Scanner db=new Scanner(System.in);
//		int sec=0;
//		System.out.println("Enter A Number:");
//		sec=db.nextInt();
//		db.close();
//		return sec;
//	}
}
