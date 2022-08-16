//write a java program to create a new file
import java.io.*;
class One
{
	public static void main(String args[])
	{
		File f=new File("one");
		try
		{
			boolean b=f.createNewFile();
			System.out.println("is file created:"+f.exists());
			System.out.println("can we read the file:"+f.canRead());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}