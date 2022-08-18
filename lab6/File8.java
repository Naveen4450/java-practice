//import java.io.BufferedWriter;
import java.io.*;
//import java.io.IOException;
class File8
{
	public static void main(String[] a)throws Exception
	{
		FileWriter fw=new FileWriter("D:\\Bufferwriter.txt");
		BufferedWriter writer=new BufferedWriter(fw);
		writer.write("Hi!");
		writer.newLine();
		writer.write("This is java.");
		writer.close();
		System.out.println("Success");
	}
}