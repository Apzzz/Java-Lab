import java.io.*;
import java.util.Scanner;

public class Files
{
	public static void main(String[] args)
	{
		int i;
		Scanner sc =new Scanner(System.in);
		String str;
		FileInputStream fin=null;
		FileOutputStream fout=null;
		
		try
		{
			File myObj=new File("file1.txt");
			if(myObj.createNewFile())
				System.out.println("Created file "+myObj.getName());
		}
		catch(IOException e)
		{
			System.out.println("Error creating file");
		}
		
		try
		{
			System.out.print("Enter the text ");
			str=sc.nextLine();
			byte s[]=str.getBytes();
			fout=new FileOutputStream("file1.txt");
			fout.write(s);
		}
		catch(IOException e)
		{
			System.out.println("Error writing file");
		}
		
		try
		{
			if(fout!=null)
				fout.close();
		}
		catch(IOException e)
		{
			System.out.println("Error closing file");
		}
		
		try
		{
		fin=new FileInputStream("file1.txt");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error opening file");
		}
		
		try
		{
			do {
				i=fin.read();
				if(i==-1)
				{
					System.out.println();
					System.out.println("End of file");	
				}
				else
					System.out.print((char)i);
			}while(i!=-1);
		}
		catch(IOException e)
		{
			System.out.println("Error reading file");
		}
		
		try
		{
			if(fin!=null)
				fin.close();
		}
		catch(IOException e)
		{
			System.out.println("Error closing file");
		}
		sc.close();
	}
}
