package lesson2democode;

public class TypeConver {

	
	public static void main(String[] args) {
		byte x = 3;
		short y = x;
		short z = 32767;
		byte z1 = (byte) z;
	 	 
		System.out.println("Byte x = " + x);
		System.out.println("Short y = " + y);
		System.out.println("Short z = " + z);
		System.out.println("Byte z1 = " + z1);
	}

}
