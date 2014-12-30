package assignment3;

import java.util.Scanner;

public class DigitalCamera {
	
	String brandName;
	double noOfMegapixels;
	double price;
	
	public  DigitalCamera(String bn,double megapixels){
		brandName=bn;
		megapixels= (megapixels>10)?10:megapixels;
		noOfMegapixels=megapixels;
	}
	
	public double calculatePrice(){
		if(noOfMegapixels<=6){
			price=99;
		}else{
			price=129;
		}		
		return price;
	}
	public void displayCamera(){
		System.out.println("Camera Name:"+brandName);
		System.out.println("Number of Megapixels: "+noOfMegapixels);
		System.out.println("Price: "+this.calculatePrice());
	}
	
	public static void main (String[] args){
		Scanner input=new Scanner(System.in);
		String brandN[]=new String[4];
		Double megPix[] =new Double[4];
		for(int i=0;i<4;i++){
			input=new Scanner(System.in);
			System.out.println("Please Enter Name of Camera");
			brandN[i]=input.nextLine();
			System.out.println("");
			System.out.println("Please Enter No. of Megapixels");
			megPix[i]=input.nextDouble();	
		}
		input.close();
		for(int i=0;i<4;i++){
			DigitalCamera dn=new DigitalCamera(brandN[i],megPix[i]);
			dn.displayCamera();
		}
		
	}
}
