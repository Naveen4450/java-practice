import java.util.*;
import java.lang.*;
public class SetPriority extends Thread
{
  public void run()
  {
   for(int i=0;i<5;i++)
   {
    System.out.println("The Current thread priority is: " + Thread.currentThread().getPriority());
   }
  }
  public static void main(String args[])
  {
    SetPriority m=new SetPriority();
  SetPriority m1=new SetPriority();
  SetPriority m2=new SetPriority();
 
   m.setPriority(7);
   m1.setPriority(Thread.MIN_PRIORITY);
  m2.setPriority(Thread.NORM_PRIORITY);
   m.start();
   m1.start();
   m2.start();
   }
}