package Kasus2;
import java.text.DecimalFormat;

//****************************************************
//PaintThings.java
//
//Compute the amount of paint needed to paint various
//things. uses the amount method of the paint class which
//takes any shape as a parameter.
//****************************************************

public class PaintThings {

	//-------------------------------------
	// Create some shapes and a paint object
	//and prints the amount of paint neede
	//to paint each shape
	//-------------------------------------
	public static void main(String[] args) 
	{
		final double COVERAGE = 350;
		Paint paint = new Paint (COVERAGE);
		
//		Rectangle deck;
//		Sphere bigBall;
//		Cylinder tank;
		
		double deckAmt, ballAmt, tankAmt;
		
		//instantiate the three shapes to paint
		Shape deck = new Rectangle(20, 35);
		Shape bigBall = new Sphere(15);
		Shape tank = new Cylinder(10, 30);
		
		//compute the amount of paint needed for each shape
		deckAmt = paint.amount(deck);
		ballAmt = paint.amount(bigBall);
		tankAmt = paint.amount(tank);
		
		//print the amount of paint for each
		DecimalFormat fmt = new DecimalFormat("0.#");
		System.out.println ("\nNumber of gallons of paint needed...");
		System.out.println ("Deck " + fmt.format(deckAmt));
		System.out.println ("Big Ball  " + fmt.format(ballAmt));
		System.out.println ("Tank " + fmt.format(tankAmt));	
	}
}
