import java.util.Scanner;

public class StringReverse 
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int x;
		System.out.print("Enter the string ");
		String s=sc.next();
		System.out.println("The string is "+ s);
		x=s.length();
		char[] c=s.toCharArray();
		for(int i=0;i<x/2;i++)
		{
			char ch=c[i];
			c[i]=c[x-i-1];
			c[x-i-1]=ch;
		}
		System.out.println("The reversed string is " + new String(c));
		sc.close();
	}
}