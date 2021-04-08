
public class CommandLineSum 
{
	public static void main(String args[])
	{
		int s=0,inv=0;
		
		System.out.print("The commandline argument is ");
		for(int i=0;i<args.length;i++)
			System.out.print(args[i]);
		System.out.println();
		
		
		for(int i=0;i<args.length;i++)
		{
			try
			{
				s+=Integer.parseInt(args[i]);
			}
			catch(NumberFormatException e)			{
				inv++;
			}
		}
		System.out.println("The sum is "+s);
		System.out.println("The number of invalid integers is "+inv);
	}
}
