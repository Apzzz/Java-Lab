import java.util.Scanner;

public class MatrixTranspose 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,j,m,n;
		System.out.print("Enter the size ");
		m=sc.nextInt();
		n=sc.nextInt();
		int a[][]=new int[m][n];
		int t[][]=new int[n][m];
		System.out.print("Enter the elements ");
		
		for(i=0;i<m;i++)
			for(j=0;j<n;j++)
				a[i][j]=sc.nextInt();
		
		System.out.println("The array is ");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
				t[j][i]=a[i][j];
			}
			System.out.println();
		}
	
		System.out.println("The transpose is ");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
				System.out.print(t[i][j]+" ");
			System.out.println();
			sc.close();
		}
	}
}
