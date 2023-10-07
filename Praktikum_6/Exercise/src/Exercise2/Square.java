package Exercise2;

public class Square extends Rectangle {
	public Square() 
	{
		super();
	}
	
	public Square(double side) 
	{
		super(side, side);// call superclass Rectangle(double, double)
	}
	
	public Square(double side, String color, boolean filled) 
	{
		super(side, side, color, filled);
	}

	public double getSide() 
	{
		return getWidth();
	}
	
	public void setSide(double side)
	{
		setWidth(side);
	}
	
	@Override
	public void setWidth(double side) 
	{
		super.setWidth(side); // Panggil setWidth superclass
        super.setLength(side); // Panggil setLength superclass
	}
	@Override
	public void setLength(double side) 
	{
		super.setWidth(side); // Panggil setWidth superclass
        super.setLength(side); // Panggil setLength superclass
	}
	@Override
	public String toString() 
	{
		return "A Square with side= " + getSide() + " which is a subclass of " + super.toString();
	}
}
