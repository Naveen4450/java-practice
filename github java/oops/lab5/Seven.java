//java program to display file,file content
import java.io.*;
import java.util.*;
public class Seven
{
	public static void main(String[] args)
	{
		try
		{
			File file1=new File("read.txt");
			FileInputStream inputstream=new FileInputStream("read.txt");
			int filelength=(int)file1.length();
			byte Bytes[]=new byte[filelength];
			System.out.println("File size is "+inputstream.read(Bytes));
			System.out.println("The file is:"+file1);
			String file2=new String(Bytes);
			System.out.println("File content is:\n "+file2);
			inputstream.close();

		}
		catch(IOException e)
		{
			System.out.println("There are some IOException");
		}

	}
}