import java.util.Scanner;
import java.util.StringTokenizer;

public class Stringtokenizer 
{
	public static void main(String args[])
	{
		int sum=0,x;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the string ");
		String s=sc.nextLine();
		System.out.print("Enter the token ");
		String t=sc.nextLine();
		
		StringTokenizer c=new StringTokenizer(s,t);
		
		while(c.hasMoreTokens())
		{
			x=Integer.parseInt(c.nextToken());
			System.out.println(x);
			sum+=x;
		}
		System.out.println("The sum is "+sum);
		sc.close();
	}
}

