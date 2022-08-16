//java program to read content from file using fileinputstream
import java.io.*;
class Ten
{
	public static void main(String args[])
	{
		try
		{
			FileInputStream fi=new FileInputStream("read.txt");
			int c;
			while((c=fi.read())!=-1)
			{
				System.out.print((char)c);
			}
			fi.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}