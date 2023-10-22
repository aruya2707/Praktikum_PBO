package Kasus2;

public class Sphere extends Shape {
	private double radius; //radius in feet
	
	//--------------------------------------
	//  Constructor: Sets up the sphere.
	//--------------------------------------
	public Sphere(double r)
	{
		super("Sphere");
		radius = r;
	}
	
	//--------------------------------------
	//  Return the surface area of the sphere.
	//--------------------------------------
	public double area() 
	{
		double area = 4 * Math.PI * Math.pow(radius, 2); 
		return area;
	}
	
	//--------------------------------------
	//  Return the surface area of the sphere.
	//--------------------------------------
	public String toString()
	{
		return super.toString() + " of radius " + radius;
	}
}
