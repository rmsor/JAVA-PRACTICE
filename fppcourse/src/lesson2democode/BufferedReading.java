package lesson2democode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReading {
	public static void main (String[] args) throws IOException
	{
		
		String input = null;
		BufferedReader in = new BufferedReader(new  
		 InputStreamReader(System.in));
		System.out.print("Type your name: ");
		input = in.readLine();
		System.out.println("Your Name " + input);
		System.out.print("Type your Age: ");
		int x = Integer.parseInt(in.readLine());
		System.out.println("Your age: "+x);
		in.close();
}
}