package lesson2democode;

public class Unicode {

	/**
	 * @authour "Renuka"
	 */
	public static void main(String[] args) {
		
		char c = 'K';
		int AsVal = (int)c;  
		String hexVal = Integer.toHexString(AsVal); 
		System.out.println("Unicode Value :" + AsVal);
		System.out.println("Hexa Decimal Value :" + hexVal);
		System.out.println("\u004b");
		System.out.println(2/5);
		
	}

}
