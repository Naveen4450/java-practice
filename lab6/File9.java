import java.io.*;
class File9
{
	public static void main(String[] a)
	{
		char array[]=new char[100];
		try{
			FileReader fr=new FileReader("D:\\Bufferwriter.txt");
			BufferedReader br=new BufferedReader(fr);
			/*int i
			while(i=br.read()!=-1)
			{
				System.out.print((char)i);
			}*/
			br.read(array);
			System.out.println("Data in the file:");
			System.out.println(array);
			br.close();
			fr.close();
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
	}
}