//java program to write into file using bufferedwriter
import java.io.*;
class Nine
{
	public static void main(String args[])throws IOException
	{
		BufferedWriter bw=new BufferedWriter(new FileWriter("Nine.txt"));
		String s="this is ninth Program";
		bw.write(s);
		bw.newLine();
		bw.write("this is BufferedWriter Program");
		bw.close();
		System.out.println("successful");
	}
}