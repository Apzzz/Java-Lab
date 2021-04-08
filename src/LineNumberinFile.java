import java.io.*;

public class LineNumberinFile 
{
	public static void main(String args[])
	{
		int i,x=1;
		
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
			System.out.print(x+" ");
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
						x++;
					System.out.println();
					System.out.print(x+" ");
				}
					if((char)i!='\n')
				System.out.print((char)i);
				}
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
	}

}
