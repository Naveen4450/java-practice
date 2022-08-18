import java.io.*;
import java.util.Scanner;
class File5
{
	public static void main(String[] a)
	{
		try
		{
			//File myobj=new File("D:\\Read.txt");
			FileInputStream fis =new FileInputStream("D:\\Read.txt");
			Scanner myReader=new Scanner(fis);
			while(myReader.hasNextLine())
			{
				String data=myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
