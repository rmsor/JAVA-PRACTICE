package assignment3;

import java.util.Scanner;

public class testClass {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in); String brandN[]=new String[4]; Double megPix[] =new Double[4]; for(int i=0;i<4;i++){ input=new Scanner(System.in); System.out.println("Please Enter Name of Camera"); brandN[i]=input.nextLine(); System.out.println(""); System.out.println("Please Enter No. of Megapixels"); megPix[i]=input.nextDouble(); } input.close();
		
	}
}
