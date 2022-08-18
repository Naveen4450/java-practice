import java.io.*;
  
public class File4
{
    public static void main(String[] args)
    {
        File file = new File("D:\\FileWriter.txt");
          
        if(file.delete())
        {
            System.out.println("File deleted successfully");
        }
        else
        {
            System.out.println("Failed to delete the file");
        }
    }
}