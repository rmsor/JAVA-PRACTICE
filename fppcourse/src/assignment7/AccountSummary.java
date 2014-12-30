package assignment7;

abstract class Account{
	String accountNumber;
	double currentAmount;
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAmount() {
		return currentAmount;
	}
	public void deposit(double deposit){
		currentAmount+=deposit;
		System.out.println("You deposited $"+deposit);
	}
	public void widthraw(double widthdraw){
		currentAmount-=widthdraw;
		System.out.println("You withdrew $"+widthdraw);
	}
	public abstract void addInterest();
	
}
class CheckingsAccount extends Account{
	double interestRate;
	
	public CheckingsAccount() {
		interestRate=1;
	}
	public CheckingsAccount(double interest) {
		interestRate=interest;
	}
	public void addInterest(){
		currentAmount+=(currentAmount*interestRate)/100;
		System.out.println("You added interest $"+(currentAmount*interestRate)/100);
	}
}
class SavingsAccount extends Account{
	double interestRate;
	
	public SavingsAccount() {
		interestRate=5;
	}
	public SavingsAccount(double interest) {
		interestRate=interest;
	}
	public void addInterest(){
		currentAmount+=(currentAmount*interestRate)/100;
		System.out.println("You added interest $"+(currentAmount*interestRate)/100);
	}
}
public class AccountSummary {

	public static void main(String[] args) {
		CheckingsAccount ca=new CheckingsAccount();
		SavingsAccount sa=new SavingsAccount();
		System.out.println("===========Checking Account================");
		ca.deposit(5000);
		ca.widthraw(1050);
		ca.addInterest();
		System.out.println("Your balance is %"+ca.getAmount());
		System.out.println("===========Saving Account================");
		sa.deposit(35800);
		sa.widthraw(22050);
		sa.addInterest();
		System.out.println("Your balance is %"+sa.getAmount());
		
	}

}
