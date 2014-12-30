package assignment4;

public class SalesMan {	
	
	private String salesId;
	private String name;
	private double saleAmount;
	
	public SalesMan(String sid,String nm, double sa){
		salesId=sid;
		name=nm;
		saleAmount=sa;
	}
	
	public void compareSales(SalesMan a, SalesMan b){
		if(a.saleAmount>b.saleAmount){
			System.out.println("Sales amount of "+a.name+" is greater than sales amount of "+b.name);
		}else if(b.saleAmount>a.saleAmount){
			System.out.println("Sales amount of "+b.name+" is greater than sales amount of "+a.name);
		}else{
			System.out.println("Sales amount of "+b.name+" is equal sales amount of "+a.name);
		}
	}
	public static void main(String[] args) {
		SalesMan s1=new SalesMan("1223","Ram",15425);
		SalesMan s2=new SalesMan("1111","Shyam",10000);
		s1.compareSales(s1, s2);

	}

}
