import java.util.*;
import java.io.*;
import java.lang.*;

public class Sleep
{
  class Runn implements Runnable
 {
  public void run()
  {
   for(int i=0;i<5;i++)
   {

  try
  {
  Thread.currentThread().sleep(500);
  
   System.out.println("Current Thread running is" + Thread.currentThread().getId());
  }
  catch(InterruptedException e)
  {
   System.out.println(e);
  }
}
 } 
}
  public static void main(String args[])
 {
   Thread t1=new Thread(new Sleep().new Runn());
  Thread t2=new Thread(new Sleep().new Runn());
  t1.setName("Lekhya");
  t1.start();
  t2.start();
  }
  
}