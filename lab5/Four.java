//write a java program to delete a file
import java.io.*;
class Four
{
	public static void main(String args[])
	{
		File f;
		try
		{
			f=new File("del.txt");
			if((f.exists())&&(f.delete()))
			{
				System.out.println(f.getName() +" deleted");
			}
			else if(f.exists()==false)
			{
				System.out.println(f.getName() +" does not exists");
			}
			else
			{
				System.out.println("deletion failed.....");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
