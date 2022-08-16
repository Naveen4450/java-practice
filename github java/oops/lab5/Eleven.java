//java program to write content to file using fileoutputstream
import java.io.*;
class Eleven
{
	public static void main(String args[])
	{
		try
		{
			FileOutputStream fs=new FileOutputStream("Eleven.txt");
			String s=new String("hello,this is the last program in FileHandling Lab");
			byte b[]=s.getBytes();
			fs.write(b);
			fs.close();
			System.out.println("succefully written to the file");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}