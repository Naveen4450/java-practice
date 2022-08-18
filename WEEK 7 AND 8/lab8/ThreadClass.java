import java.util.*;
import java.io.*;
class MultiThread extends Thread
{
  public void run()
  {
   try
   { 
    System.out.println("Thread running is: " + Thread.currentThread().getId());
     }
  catch(Exception ee)
  {
   System.out.print(ee);
   }
  }
}
public class ThreadClass
{ 
public static void main(String args[])
 {
  for(int i=0;i<5;i++)
  {
   
  MultiThread m=new MultiThread();
    m.start();
  }
}
 } 