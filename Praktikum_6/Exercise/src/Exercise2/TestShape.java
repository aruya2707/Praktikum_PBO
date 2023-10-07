package Exercise2;

public class TestShape {

	public static void main(String[] args) 
	{
		//test 1
		Shape s1 = new Shape();
//		System.out.println("A shape with"
//				 + " color of " + s1.getColor()
//				 + " and " + s1.isFilled());	
		System.out.println(s1);
	
		Shape s2 = new Shape("red", false);
		System.out.println(s2);
		
		//test 2
		Circle c1 = new Circle();
		System.out.println(c1);
		
		Circle c2 = new Circle(0.6);
		System.out.println(c2);
		
		Circle c3 = new Circle(0.2,"red", false);
		System.out.println(c3);
		
		//test 3
		Rectangle r1 = new Rectangle();
		System.out.println(r1);
		
		Rectangle r2 = new Rectangle(2.0, 3.0);
		System.out.println(r2);
		
		Rectangle r3 = new Rectangle(2.0, 3.0, "blue", false);
		System.out.println(r3);
		
		//test 4
		Square q1 = new Square ();
		System.out.println(q1);
		
		Square q2 = new Square (0.2);
		System.out.println(q2);		

		Square q3 = new Square (0.5, "blue", false);
		System.out.println(q3);
		
	}

}
