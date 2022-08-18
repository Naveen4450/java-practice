//write a java program to read a file using filereader
import java.io.*;
class Two
{
	public static void main(String args[])throws IOException
	{
		File f=new File("read.txt");
		FileReader fr=new FileReader(f);
		char arr[]=new char[100];
		fr.read(arr);
		for(char c:arr)
		{
			System.out.print(c);
		}
		fr.close();
	}
}
