package Kasus2;

//****************************************************
//Paint.java
//
//Represent a type of paint that has a fixed area
//covered by a gallon. All measurentments are in feet.
//****************************************************
public class Paint {
	private double coverage;
	
	//-------------------------------------
	// Constructor: Sets up the paint object.
	//-------------------------------------
	public Paint(double c)
	{
		this.coverage = c;
	}
	
	//-------------------------------------
	// Return the amount of paint (number of gallons).
	// needed to paint the shape given as the parameter.
	//-------------------------------------
	public double amount(Shape s)
	{
		System.out.println("Computing amount for " + s);
		double area = s.area();
	// Return  Use the fact that the amount of paint needed
	// is the area of the shape divided by the coverage for the paint
		return area / coverage;
	}
}
