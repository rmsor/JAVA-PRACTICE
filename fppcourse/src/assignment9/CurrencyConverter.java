package assignment9;

public class CurrencyConverter {
	
	InnerConverter inner;
	
	public CurrencyConverter(String iC,String oC,double eR,double inpAmt){
		inner=new InnerConverter(iC,oC,eR,inpAmt);
	}
	
	private static class InnerConverter{
		private static String inputCurrency;
		private static String outputCurrency;
		private static double exchangeRate;
		private static double inputAmount;
		private static double outputAmount;
		
		public InnerConverter(String iC,String oC,double eR,double inpAmt){
			inputCurrency=iC;
			outputCurrency=oC;
			exchangeRate=eR;
			inputAmount=inpAmt;
		}
		
		public static double convert(){
			outputAmount=inputAmount*exchangeRate;
			return outputAmount;
		}
		public static void display(){
			System.out.println("Input Currency: "+inputCurrency);
			System.out.println("Output Currency: "+outputCurrency);
			System.out.println("Exchange Rate: "+exchangeRate);
			System.out.println("Input Amount: "+inputAmount);
			System.out.println("Output Amount: "+InnerConverter.convert());
		}
	}
	public static void main(String[] args){
		CurrencyConverter cv=new CurrencyConverter("USD","EUR",1.25,15000);
		InnerConverter.display();
		
	}
}
