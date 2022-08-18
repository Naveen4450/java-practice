//write a java program to write to file using filewriter
import java.io.*;
class Three
{
	public static void main(String args[]) throws IOException
	{
		File f=new File("read.txt");
		f.createNewFile();
		FileWriter fw=new FileWriter(f);
		fw.write("this is third program in lab5\n");
		fw.write("This is File Writer program");
		System.out.println("successful");
		fw.flush();
		fw.close();
	}
}