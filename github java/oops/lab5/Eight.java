//java program to read file using bufferedreader
import java.io.*;
class Eight
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new FileReader("read.txt"));
		char a[]=new char[100];
		br.read(a);
		System.out.println(a);
		br.close();
	}
}


