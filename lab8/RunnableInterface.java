import java.util.*;
import java.io.*;
import java.lang.*;

public class RunnableInterface
{
  public static void main(String args[])
 {
   Thread t1=new Thread(new RunnableInterface().new Run());
  Thread t2=new Thread(new RunnableInterface().new Run());
  t1.setName("Lekhya");
  t1.start();
  t2.start();
  }
   class Run implements Runnable
{
  public void run()
  {
   for(int i=0;i<5;i++)
   {
   System.out.println("Current Thread running is" + Thread.currentThread().getName());
  }
  }
}
 } 
