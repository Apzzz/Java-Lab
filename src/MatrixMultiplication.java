import java.util.Scanner;
public class MatrixMultiplication 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,j,m,n,p,q,k;
		System.out.print("Enter the size of 1st array ");
		m=sc.nextInt();
		n=sc.nextInt();
		int a[][]=new int[m][n];
		System.out.print("Enter the elements ");
		
		for(i=0;i<m;i++)
			for(j=0;j<n;j++)
				a[i][j]=sc.nextInt();
		
		System.out.print("Enter the size of 2nd array ");
		p=sc.nextInt();
		q=sc.nextInt();
		int b[][]=new int[p][q];
		System.out.print("Enter the elements ");
		
		for(i=0;i<p;i++)
			for(j=0;j<q;j++)
				b[i][j]=sc.nextInt();
		
		System.out.println("The first array is ");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
		
		System.out.println("The second array is ");
		for(i=0;i<p;i++)
		{
			for(j=0;j<q;j++)
				System.out.print(b[i][j]+" ");
			System.out.println();
		}
		
		if(n==p)
		{
			int c[][]=new int[m][q];
			for(i=0;i<m;i++)
			{
				for(j=0;j<q;j++)
				{
					c[i][j]=0;
					for(k=0;k<n;k++)
						c[i][j]+=a[i][k]*b[k][j];
				}
			}
			System.out.println("The multiplied array is ");
			for(i=0;i<m;i++)
			{
				for(j=0;j<q;j++)
					System.out.print(c[i][j]+" ");
				System.out.println();
			}
		}
		else
			System.out.println("The matrices cannot be multiplied ");
		sc.close();
	}
		
}
