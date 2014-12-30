package lesson2democode;

public class ArraySplit {

	
	public static void main(String[] args) {
		//String s = "hello,how,are,you,today";
		String s = "hello how,are,you,today";
		String[] parsedVals =s.split(",| ");
		//String[] parsedVals =s.split(",");
		for(String x: parsedVals) {
			System.out.println(x);
			String name = "Maharishi";
			String sub = name.substring(0, 3);
			System.out.println(sub);
			String sub1 = name.substring(0,0);
			System.out.println("SubString: " + sub1);
			

	}
	}
}
