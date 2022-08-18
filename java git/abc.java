public class abc extends Thread
 {
 private int delay;
 abc (String name, float seconds)
 {
 super (name);
 delay = (int) seconds * 1000;// delays are in milliseconds
 start(); // start up ourself!
 }
public void run ( )
{
 System.out.println (Thread.currentThread ( ).getName ( ) );
 try
 {
 Thread.sleep (delay);
 }
 catch (InterruptedException e)
 {
 return ;
 }
 }

public static void main (String args[ ])
 { 
 new abc (“one potato”, 1.1F);
 new abc (“two potato”, 1.3F);
 new abc (“three potato”, 0.5F);
 new abc (“four”, 0.7F);
}
}