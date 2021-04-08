import java.io.*;

public class CountinFiles 
{
	public static void main(String args[])
	{
		int i,l=1,c=0,w=1;
		FileInputStream fin=null;
		
		try
		{
		fin=new FileInputStream("file2.txt");
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
				{ 
					if((char)i=='\n')
						{
						l++;
						w++;
						}
					else if((char)i==' ')
						w++;
					else 
						c++;
					System.out.print((char)i);
				}
			}while(i!=-1);
			System.out.println("The no of characters is "+c);
			System.out.println("The no of words is "+w);
			System.out.println("The no of lines is "+l);
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
	}
}
