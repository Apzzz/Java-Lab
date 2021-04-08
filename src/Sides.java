
abstract class Shape
{
	abstract void numberOfSides();
}

class Rectangle extends Shape
{
		void numberOfSides()
		{
			System.out.println("The number of sides of Rectangle is 4");
		}
}

class Triangle extends Shape
{
	void numberOfSides()
	{
		System.out.println("The number of sides of Triangle is 3");
	}
}

class Hexagon  extends Shape
{
	void numberOfSides()
	{
		System.out.println("The number of sides of Hexagon is 6");
	}
}

public class Sides 
{
	public static void main(String args[])
	{
		Rectangle r=new Rectangle();
		Triangle t= new Triangle();
		Hexagon h=new Hexagon();
		r.numberOfSides();
		t.numberOfSides();
		h.numberOfSides();
		
	}
}
