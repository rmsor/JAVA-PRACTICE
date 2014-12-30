package assignment3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CheckLeapYear {
	private String dob;
	
	public CheckLeapYear(String dob){
		this.dob=dob;
	}
	
	public void checkLeapYr(){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
		try {			 
			Date myDob = sdf.parse(dob);
			GregorianCalendar gc=new GregorianCalendar();
			gc.setTime(myDob);
			boolean isLeapYear = gc.isLeapYear(gc.get(GregorianCalendar.YEAR));
		    System.out.println("Is "+gc.get(GregorianCalendar.YEAR)+" leap year:" + (isLeapYear?"Yes":"No"));

		} catch (ParseException e) {
			e.printStackTrace();
		}		
	}
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please Enter Your Birth Date: (YYYY-MM-DD) ::");
		String dateOB=input.nextLine();
		CheckLeapYear cl=new CheckLeapYear(dateOB);
		cl.checkLeapYr();
		input.close();

	}

}
