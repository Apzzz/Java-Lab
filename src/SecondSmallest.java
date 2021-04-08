import java.util.Scanner;

public class SecondSmallest 
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in); 
		int a[],n,l,s,i;
		System.out.print("Enter the size ");
		n=sc.nextInt();
		a=new int[n];
		System.out.print("Enter the elements ");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		s=l=Integer.MAX_VALUE;
		for(i=0;i<n;i++)
			if((a[i]<l)||(a[i]<s))
			{
				if(a[i]<l)
				{
					s=l;
					l=a[i];
				}
				else if(a[i]!=l)
					s=a[i];
			}
		System.out.println("The second smallest number in the array is " + s);	
		sc.close();
	}
}
