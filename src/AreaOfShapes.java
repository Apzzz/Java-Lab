import java.util.Scanner;

public class AreaOfShapes 
{
	static Scanner sc=new Scanner(System.in);
	
	public static void calarea(double r)
	{
		double a1=3.14*r*r;
		System.out.println("The area of circle of radius "+r+" is "+a1 +" units");
	}
		
	public static void calarea(double l,double b)
	{
		double a2=l*b;
		System.out.println("The area of rectangle of length is "+a2+" units");
	}
	public static void calarea()
	{
		System.out.print("Enter the base and height of the triangle ");
		double a=sc.nextDouble();
		double b3=sc.nextDouble();
		double a3=a*b3/2;
		System.out.println("The area of the triangle is "+a3 +" units");
	}
	
	
	public static void main(String args[])
	{
		int x;
		do
		{
			System.out.print("Enter your choice 1- circle 2-rectangle 3-triangle 0-exit ");
			x=sc.nextInt();
			switch(x)
			{
			case 1: System.out.print("Enter the radius of the circle ");
					double r=sc.nextDouble();
					calarea(r);
					break;
			case 2: System.out.print("Enter the length and breadth of the rectangle ");
					double l=sc.nextDouble();
					double b=sc.nextDouble();
					calarea(l,b);
					break;
			case 3: calarea();
					break;
			}	
		}while(x!=0);
	}
}
