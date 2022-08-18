import java.lang.*;
import java.util.*;
public class SuspendResume extends Thread
{
 public void run()
 {
  for(int i=0;i<5;i++)
  {
   System.out.println("The current thread which is running: " + Thread.currentThread().getName());
   }
  }
  public static void main(String args[])
  {
  SuspendResume s1=new SuspendResume();
   SuspendResume s2=new SuspendResume();
    SuspendResume s3=new SuspendResume();
  s1.setName("java");
  s2.setName("cse");
  s3.setName("rgukt");
  s1.start();
  s2.start();
  s2.suspend();
  s3.start();
  s2.resume();
  }
 }
