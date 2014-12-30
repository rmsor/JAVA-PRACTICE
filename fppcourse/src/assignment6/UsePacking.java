package assignment6;

class Packing{
	double weight;
	char shippingMethod;
	double shippingCost;
		
	public Packing(double weight,char shippingMethod){
		this.weight=weight;
		this.shippingMethod=shippingMethod;
	}
	public void calculateCost(){
		
		if(weight<=8){
			switch(shippingMethod){
				case 'A':
					shippingCost=2.0;
					break;
				case 'T':
					shippingCost=1.5;
					break;
				case 'M':
					shippingCost=0.5;
					break;
				default:
						shippingCost=0;
			}
		}else if(weight<=16){
			switch(shippingMethod){
				case 'A':
					shippingCost=3.0;
					break;
				case 'T':
					shippingCost=2.35;
					break;
				case 'M':
					shippingCost=1.5;
					break;
				default:
						shippingCost=0;
			}
		}else{
			switch(shippingMethod){
				case 'A':
					shippingCost=4.5;
					break;
				case 'T':
					shippingCost=3.25;
					break;
				case 'M':
					shippingCost=2.15;
					break;
				default:
					shippingCost=0;
			}
		}
	}
	public void display(){
		System.out.println("Weight: "+weight);
		System.out.println("Shipping Type: "+shippingCost);
		System.out.println("Shipping Cost: "+shippingCost);
		System.out.println("---------------------------------");
	}
}
class InsuredPacking extends Packing{
	double insuranceAmount;
	
	public InsuredPacking(double weight,char shippingMethod){
		super(weight,shippingMethod);
	}
	@Override
	public void calculateCost(){
		super.calculateCost();
		if(shippingCost<4){
			insuranceAmount=0;
		}else if(shippingCost<16){
			insuranceAmount=2.45;
		}else if(shippingCost<=50){
			insuranceAmount=7.35;
		}else if(shippingCost<=100){
			insuranceAmount=20.55;
		}
	}
	public void display(){
		super.display();
		System.out.println("Insurance Cost: "+insuranceAmount);
		System.out.println("Total Cost: "+(insuranceAmount+shippingCost));
		System.out.println("*************************************************");
	}
}
public class UsePacking {

	public static void main(String[] args) {
		Packing pk1=new Packing(5,'A');
		pk1.calculateCost();
		pk1.display();
		Packing pk2=new Packing(12,'T');
		pk2.calculateCost();
		pk2.display();
		Packing pk3=new Packing(19,'M');
		pk3.calculateCost();
		pk3.display();
		Packing ipk1=new InsuredPacking(15,'T');
		ipk1.calculateCost();
		ipk1.display();
		Packing ipk2=new InsuredPacking(3,'A');
		ipk2.calculateCost();
		ipk2.display();
		Packing ipk3=new InsuredPacking(19,'M');
		ipk2.calculateCost();
		ipk2.display();

	}

}
