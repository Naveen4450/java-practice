import java.io.*;
class File10
{
	public static void main(String[] a)
	{
		String data="This is the text i want to insert";
		try
		{
			FileOutputStream output=new FileOutputStream("D:\\File.txt");
			byte[] array=data.getBytes();
			output.write(array);
			output.close();
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
	}
}