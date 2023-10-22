package Kasus2;

public class Cylinder extends Shape {
	private double height; 
	private double radius;
	
	//--------------------------------------
	//  Constructor: Sets up the rectangle.
	//--------------------------------------
	public Cylinder(double r, double h) 
	{
		super("Cylinder");
		radius = r; // call superclass constructor Circle(r)
		height = h;
	}
	
	//--------------------------------------
	//  Return the surface area of the sphere.
	//--------------------------------------
	public double area() 
	{
		double area = Math.PI * radius * radius * height; 
		return area;
	}
	
	//--------------------------------------
	//  Return the surface area of the sphere.
	//--------------------------------------
	public String toString()
	{
		return super.toString() + " height: " + height + " and radius " + radius;
	}
}
