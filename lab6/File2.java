import java.io.FileReader; 
import java.io.IOException; 
public class File2 {  
    public static void main(String args[])
   throws Exception{    
          FileReader fr=new FileReader("D:\\FileWriter.txt");    
          int i;    
          while((i=fr.read())!=-1)    
          System.out.print((char)i);    
          fr.close();    
    } 
}    