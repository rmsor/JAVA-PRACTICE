package lesson2democode;

public class ContExample {
	public static void main(String args[]) {
		int i;
		// print even numbers between 0 and 100
		for(i = 0; i<=10; i++) {
		if((i%2) != 0) continue; // iterate
		System.out.println(i);
		}
		}
}
