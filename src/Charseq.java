import java.util.Scanner;

class demo implements CharSequence
{
	 private String s;
	public demo(String s)
	{
		this.s=s;
	}
	
	public String toString()
	{
		StringBuilder str=new StringBuilder(s);
		return str.reverse().toString();
	}
	public int length()
	{
		return s.length();
	}
	public CharSequence subSequence(int a,int e)
	{
		if(a<0)
			throw new StringIndexOutOfBoundsException(a);
		else if(e>s.length())
			throw new StringIndexOutOfBoundsException(e);
		else if(a>e)
			throw new StringIndexOutOfBoundsException(a-e);
		StringBuilder substr=new StringBuilder(s.subSequence(a, e));
		return substr;
	}
	public char charAt(int i)
	{
		if(i<0||i>s.length())
			throw new StringIndexOutOfBoundsException(i);
		return s.charAt(s.length()-1-i);
	}
}

public class Charseq 
{
	public static void main(String args[])throws StringIndexOutOfBoundsException
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string ");
		String s=sc.nextLine();
		demo ob=new demo(s);
		System.out.print("Enter the starting and ending of substring ");
		int a=sc.nextInt();
		int e=sc.nextInt();
		
		System.out.println("The length of the string using length() is "+ob.length());
		System.out.println("The substring using subSequence() "+ob.subSequence(a, e));
		System.out.print("Reverse of string using charAt() ");
		for(int i=0;i<ob.length();i++)
			System.out.print(ob.charAt(i));
		System.out.println();
		System.out.println("Reverse of string using toString() "+ob);
		sc.close();
	}
}
