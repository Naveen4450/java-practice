import java.io.FileWriter;
import java.io.IOException;
class File3
{
    public static void main(String[] args) throws IOException
    {
        String str = "File Handling in Java using FileWriter";
        FileWriter fw=new FileWriter("D:\\FileWriter.txt"); 
        for (int i = 0; i < str.length(); i++)
            fw.write(str.charAt(i));
        System.out.println("Writing successful");
        fw.close();
    }
}