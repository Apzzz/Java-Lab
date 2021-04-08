import java.util.Scanner;

public class PrimeOrNot
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in); 
		
		int x,n;
		System.out.print("Enter the number ");
		x=sc.nextInt();
		if(x==0||x==1)
			System.out.println("The number "+ x + " is neither prime nor composite");
		else if(x==2)
			System.out.println("The number " + x + " is prime");
		else 
		{
		for(n=2;n<=x/2;n++)
		{
			if(x%n==0)
			{
				System.out.println("The number is not prime ");
				System.exit(0);
			}
		}
		System.out.println("The number " + x +  " is prime ");
		}
		sc.close();
		}
}
