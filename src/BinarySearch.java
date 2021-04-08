import java.util.Scanner;


public class BinarySearch {
	public static int binser(int a[],int l,int h,int x)
	{
		int m=0;
while(h>=l)
{
	m=(l+h)/2;
	if(a[m]==x)
		return m;
	else if(a[m]<x)
		l=m+1;
	else 
		h=m-1;
}
return -1;
	}
	public static void main(String args[]) {
		
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.print("Enter the elements ");
		for( i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.print("Enter the element to be searched ");
		int x=sc.nextInt();
		
		
		int y=binser(a,0,n-1,x);
			
		if(y==-1)
		System.out.println("Element not found ");
		else
			System.out.println("Element found at position "+y);
		sc.close();
	}
}
