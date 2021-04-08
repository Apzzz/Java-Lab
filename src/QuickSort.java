import java.util.Scanner;

public class QuickSort {
	
	public int partition(String a[],int l,int h)
	{
		int i,j,pi,f=0;
		String temp;
		pi=i=l;
		j=h;
		while(f!=1)
		{
			while(a[pi].compareToIgnoreCase(a[j])<=0&&pi!=j)
				j--;
				if(pi==j)
					f=1;
				else if(a[pi].compareToIgnoreCase(a[j])>0)
				{
					temp = a[pi];
					a[pi] = a[j];
					a[j] = temp;
					pi=j;
				}
				
				if(f!=1)
				{
					while(a[pi].compareToIgnoreCase(a[i])>=0&&pi!=i)
						i++;
					if(pi==i)
						f=1;
					else if(a[pi].compareToIgnoreCase(a[i])<0)
					{
						temp = a[pi];
						a[pi] = a[i];
						a[i] = temp;
						pi=i;
					}
				}
		}
		return pi;
	}

	public void sort(String a[], int l, int h) {
		if (l < h) {
			int p=partition(a,l,h);

			sort(a, l, p- 1);
			sort(a, p + 1, h);
		}
	}

	public static void main(String srgs[]) {
		QuickSort ob = new QuickSort();
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array ");
		int n = sc.nextInt();
		String a[] = new String[n];
		System.out.print("Enter the elements ");
		a[0]=sc.nextLine();
		for (i = 0; i <a.length; i++)
			a[i] = sc.nextLine();

		for (i = 0; i <a.length; i++)
			System.out.print(a[i]+"  ");
		System.out.println();

		ob.sort(a, 0, n - 1);

		System.out.println("Array after quicksort ");
		for (i = 0; i <a.length; i++)
			System.out.print(a[i]+"  ");
		System.out.println();

		sc.close();
	}
}
