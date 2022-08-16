//write a java program to read a file line by line
import java.io.*;
class Five
{
	public static void main(String args[])throws IOException
	{
		File f=new File("read.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String s=br.readLine();
		while(s!=null)
		{
			System.out.println(s);
			s=br.readLine();
		}
		br.close();
	}
}

