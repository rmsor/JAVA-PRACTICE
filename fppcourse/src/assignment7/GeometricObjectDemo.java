package assignment7;

import java.util.Date;

interface GeometricOjectIn{
	double getArea();
	double getPerimeter();
}
class GeometricObject {
	protected String color;
	protected boolean filled;
	protected Date dateCreated;
	
	public boolean equals(Rectangle obj,Circle obj1) {
        if (obj instanceof GeometricObject && obj1 instanceof GeometricObject){
        	GeometricObject oc=(GeometricObject) obj;
        	GeometricObject oc1=(GeometricObject) obj1;
            return (oc.color.equals(oc1.color)) && (oc.dateCreated.equals(oc1.dateCreated)); 
        }else
            return false;
    }
	
	@Override
	public int hashCode() {
	    int hashCode = 0;
	    hashCode = hashCode * 37 + this.color.hashCode();
	    hashCode = hashCode * 37 + this.dateCreated.hashCode();
	    return hashCode;
	}
	public GeometricObject(){
		color="white";
		filled=false;
		dateCreated=new Date();
	}
	public GeometricObject(String color, boolean filled){
		this.color=color;
		this.filled=filled;
		dateCreated=new Date();
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public String toString()
	 {
	 return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	 }
}
class Circle extends GeometricObject  implements GeometricOjectIn{
	private double radius;
	
	public Circle(){
		radius=0;
	}
	public Circle(double radius){
		this.radius=radius;	
	}
	
	public Circle(double radius,String color, boolean filled){
		super(color,filled);
		this.radius=radius;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea(){
		return Math.PI*radius*radius;
	}
	public double getPerimeter(){
		return Math.PI*radius*2;	
	}
	public double getDiameter(){
		return 2*radius;
	}
}
class Rectangle extends GeometricObject implements GeometricOjectIn {
	private double width;
	private double height;
	
	public Rectangle(){
		width=0;
		height=0;
	}
	public Rectangle(double width,double height){
		this.width=width;	
		this.height=height;
	}
	
	public Rectangle(double width,double height,String color, boolean filled){
		super(color,filled);
		this.width=width;	
		this.height=height;
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getArea(){
		return height*width;
	}
	public double getPerimeter(){
		return 2*(height+width);	
	}
}

public class GeometricObjectDemo {

	public static void main(String[] args) {
		Circle c1=new Circle(4.5,"Red",true);
		System.out.printf("Radius of Circle: %.2f \n",c1.getRadius());
		System.out.printf("Area of Circle: %.2f \n",c1.getArea());
		System.out.printf("Perimeter of Circle: %.2f \n",c1.getPerimeter());
		System.out.printf("Diameter of Circle:%.2f \n",c1.getDiameter());
		System.out.println("Color of Circle: "+c1.getColor());
		System.out.println("Created Date: "+c1.getDateCreated());
		System.out.println("========================================");
		Rectangle r1=new Rectangle(2.5,4.5,"Green",true);
		System.out.println("Width of Rectangle: "+r1.getWidth());
		System.out.println("Height of Rectangle: "+r1.getHeight());
		System.out.println("Area of Rectangle: "+r1.getArea());
		System.out.println("Perimeter of Rectangle: "+r1.getPerimeter());
		System.out.println("Color of Rectangle: "+r1.getColor());
		System.out.println("Created Date: "+r1.getDateCreated());
		System.out.println("========================================");
		GeometricObject go=new GeometricObject();
		System.out.println("Testing if both objects are equal: "+go.equals(r1,c1));
		System.out.println("Hash Code for Circle Object: "+c1.hashCode());
		System.out.println("Hash Code for Rectangle Object: "+r1.hashCode());
	}

}
