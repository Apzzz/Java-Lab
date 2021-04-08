import java.util.Scanner;

public class Count
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int c=0;
		System.out.print("Enter the string ");
		String s= sc.nextLine();
		System.out.print("Enter the character to be count ");
		String st=sc.next(); 
		char ch=st.charAt(0);
		for(int i=0;i<s.length();i++)
			if(s.charAt(i)==ch)
				c++;
		System.out.println("The count of " + ch + " is " + c);
		sc.close();
	}
}