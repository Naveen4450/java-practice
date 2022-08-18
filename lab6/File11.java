import java.io.*;
class File11
{
	public static void main(String[] a)
	{
		try
		{
			FileInputStream input=new FileInputStream("D:\\File.txt");
			System.out.println("Data in the file:");
			int i=input.read();
			while(i!=-1)
			{
				System.out.print((char)i);
				i=input.read();
			}
			input.close();
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
	}
} 