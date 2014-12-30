package assignment1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FormatDollar {

	public static void main(String[] args) {
		FormatDollar fD = new FormatDollar();
		Double inp = fD.getAmount();
		fD.parseAmount(inp);
	}

	public double getAmount() {
		Scanner db = new Scanner(System.in);
		double dollar = 0.00;
		System.out.println("Enter Any Amount in Dollar $:");
		dollar = db.nextDouble();
		DecimalFormat df = new DecimalFormat("#.##");
		dollar = Double.valueOf(df.format(dollar));
		db.close();
		return dollar;
	}

	public void parseAmount(double mn) {
		int dollars = 0, quarters = 0, dime = 0, nikels = 0, pennies = 0;
		dollars = (int) mn;
		String str = String.valueOf(mn);
		int index = str.indexOf('.');
		int i = Integer.parseInt(str.substring(index + 1));
		if (i >= 25) {
			quarters = i / 25;
			i = i % 25;
		}
		if (i >= 10) {
			dime = i / 10;
			i = i % 10;
		}
		if (i >= 5) {
			nikels = i / 5;
			i = i % 5;
		}
		pennies = i;
		System.out.println("Dollars:" + dollars);
		System.out.println("Quarters:" + quarters);
		System.out.println("Dimes:" + dime);
		System.out.println("Nikels:" + nikels);
		System.out.println("Pennies:" + pennies);
	}
}
