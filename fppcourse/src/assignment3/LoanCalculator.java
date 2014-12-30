package assignment3;

public class LoanCalculator {
	
	private double loanAmount;
	private double interestRate;
	private double loanPeriod;
	private double interestAmount;
	private double totalPayment;
	
	public LoanCalculator(double la,double ir,double lp){
		loanAmount=la;
		interestRate=ir;
		loanPeriod=lp;
		interestAmount=(loanAmount*interestRate*loanPeriod)/100;
		totalPayment=loanAmount+interestAmount;
	}
	
	public double monthlyPayment(){
		return totalPayment/(12*loanPeriod);
	}
	
	public double yearlyPayment(){
		return totalPayment/loanPeriod;
	}

	public static void main(String[] args) {
		LoanCalculator lc[]={new LoanCalculator(15000, 10.5, 3),
								new LoanCalculator(20000, 12.5, 2),
								new LoanCalculator(10000, 9, 1),
								new LoanCalculator(5000, 20.5, 6)
							};
		for(int i=0;i<lc.length;i++){
			System.out.println("==========FOR LOAN NUMBER "+(i+1)+" ================");
			System.out.println("Loan Amount: "+lc[i].loanAmount);
			System.out.println("Interest Rate: "+lc[i].interestRate);
			System.out.println("Loan Period: "+lc[i].loanPeriod);
			System.out.println("Monthly Payment: "+lc[i].monthlyPayment());
			System.out.println("Total Payment: "+lc[i].totalPayment);
		}

	}

}
