import java.io.File;

class File1
 {
 	public static void main(String[] args) 
	{
   	 try 
	{
		File file = new File("D:\\JavaFile.java");
      		boolean value = file.createNewFile();
      		if (value)
		  {
        			System.out.println("New Java File is created.");
      		}
     		 else
		 {
        			System.out.println("The file already exists.");
     		 }
   	 }
    	catch(Exception e) 
	{
     		 e.getStackTrace();
    	}
  	}
}