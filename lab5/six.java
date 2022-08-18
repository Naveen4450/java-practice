//java program to read one file and write to another file
import java.io.*;
class Six
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new FileReader("read.txt"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("six.txt"));
		String s=br.readLine();
		while(s!=null)
		{
			bw.write(s);
			bw.newLine();
			s=br.readLine();
		}
		br.close();
		bw.close();
		br=new BufferedReader(new FileReader("six.txt"));
		s=br.readLine();
		while(s!=null)
		{
			System.out.println(s);
			s=br.readLine();
		}
		br.close();
	}
}