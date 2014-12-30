package assignment4;

public class Billing {
	private double totalDue;
	
	public double computeBill(double price){
		totalDue=price*1.08;
		return totalDue;
	}
	
	public double computeBill(double price,int qty){
		totalDue=(price*qty)*1.08;
		return totalDue;
	}
	
	public double computeBill(double price,int qty,double couponValue){
		totalDue=((price*qty)-couponValue)*1.08;
		return totalDue;
	}

	public static void main(String[] args) {
		Billing bl=new Billing();
		System.out.format("Bill Amount: %.2f\n",bl.computeBill(1200));
		System.out.format("Bill Amount: %.2f\n",bl.computeBill(1350,5));
		System.out.format("Bill Amount: %.2f\n",bl.computeBill(1600,4,230));

	}

}
