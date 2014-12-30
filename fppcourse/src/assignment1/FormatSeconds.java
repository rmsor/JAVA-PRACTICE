package assignment1;

import java.util.Scanner;

public class FormatSeconds {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FormatSeconds fD=new FormatSeconds();
		int inp=fD.getSeconds();
		fD.parseSecond(inp);
	}
	public int getSeconds(){
		Scanner db=new Scanner(System.in);
		int sec=0;
		System.out.println("Enter Number of Seconds:");
		sec=db.nextInt();
		db.close();
		return sec;
	}
	
	public void parseSecond(int mn){
		int hours=0,minutes=0,seconds=0,i=0;		
		hours=mn/3600;
		i=mn%3600;
		if(i>=60){
			minutes=i/60;
			i=i%60;
		}
		seconds=i;
		System.out.println("Hours:"+hours);
		System.out.println("Minutes:"+minutes);
		System.out.println("Seconds:"+seconds);
	}
}
