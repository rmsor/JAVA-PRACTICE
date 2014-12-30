package assignment1;

public class CalculatePopulation {

	public static void main(String[] args) {
		long curPop=312032486;
		long nSecYear=365*60*60*24;
		long birth=nSecYear*7;
		long death=nSecYear*13;
		long migrate=nSecYear*45;
		long nextYearPopulation=curPop+birth+migrate-death;
		System.out.println("Total Population After One Year: "+nextYearPopulation);
	}

}
