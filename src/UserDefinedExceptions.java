import java.util.Scanner;

class MarksOutOfBoundsException extends Exception
{
	public MarksOutOfBoundsException(String s)
	{
		System.out.println(s);
	}
}
public class UserDefinedExceptions
{
	public static void main(String args[])throws MarksOutOfBoundsException
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the mark of the student (0-50) ");
		int mark=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the name of the student ");
		String n=sc.nextLine();
		
		try
		{
			if(mark<0||mark>50)
				throw new MarksOutOfBoundsException("Mark not in the given range ");
			else 
				System.out.println("The mark is "+mark);
		}
		catch(MarksOutOfBoundsException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("The name is "+n);
		}
		sc.close();
	}
}
