package assignment4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Library {
	private String personName;
	private String personId;
	private String book;
	private char personType;
	
	public Library(String pn,String pid,String bk,char pt){
		personName=pn;
		personId=pid;
		book=bk;
		personType=pt;
	}
	public void getUserDetails(){
		System.out.println("\n");
		System.out.println("Person Name :"+personName);
		System.out.println("Person Id :"+personId);
		//System.out.println("Book Name :"+book);
		System.out.println("Person Type :"+(personType=='F'?"Faculty":"Student"));
	}
	public void getReport(String issuedDate,BookDetail bds) throws ParseException{
		SimpleDateFormat df=new SimpleDateFormat("yyyy-mm-dd");
		Date issD=df.parse(issuedDate);
		getUserDetails();
		bds.displayBookDetails();
		System.out.printf("Due Date: %s %tB %<te, %<tY","\t", dueDate(issD));
		
	}
	public Date dueDate(Date issuedDate){
		Date dueDate=new Date();
		Calendar cal = Calendar.getInstance();
        cal.setTime(issuedDate);        
        if(personType=='F'){
        	cal.add(Calendar.MONTH, 2);
			dueDate=cal.getTime();
		}else if(personType=='S'){
			cal.add(Calendar.MONTH, 1);
			dueDate=cal.getTime();
		}		
		return dueDate;
	}
	
	public static void main(String[] args) throws ParseException {
		BookDetail bd=new BookDetail();
		bd.getBookDetails("Introduction to Java","3434","Jon Dew","Milestone","2014");
		BookDetail bd1=new BookDetail();
		bd1.getBookDetails("Introduction to C","1111","Harrison","Macgrew","2010");
		
		Library lib=new Library("Ram","2322","Introduction to Java",'F');
		lib.getReport("2014-01-05",bd); 
		Library lib2=new Library("Shyam","2222","Introduction to C",'S');
		lib2.getReport("2014-01-05",bd1);
	}

}
class BookDetail{
	private String BookName;
	private String ISBN;
	private String AuthorName;
	private String Publication;
	private String Edition;
	
	public void getBookDetails(String bn, String isbn,String an, String pb,String ed){
		BookName=bn;
		ISBN=isbn;
		AuthorName=an;
		Publication=pb;
		Edition=ed;
	}
	
	public void displayBookDetails(){
		System.out.println("Book Name :"+BookName);
		System.out.println("ISBN :"+ISBN);
		System.out.println("Author Name :"+AuthorName);
		System.out.println("Publication Name :"+Publication);
		System.out.println("Edition :"+Edition);
	}
}
