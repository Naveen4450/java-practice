import java.util.*;
import java.io.*;
import java.lang.*;
public class Bank implements Runnable
{
 private Account act=new Account();
  public static void main(String args[])
   {
   Bank b=new Bank();
   Thread first=new Thread(b);
  Thread second=new Thread(b);
  first.setName("husband");
  second.setName("wife");
  first.start();
  second.start();
   }
 public  void run()
 {
   for(int i=0;i<5;i++)
  {
   makeWithdrawl(10);
   if(act.getBalance()<0)
    {
  System.out.println("account is overdrawn!!");
    }
   }
 }
private synchronized void makeWithdrawl(int amt)
{
  if(act.getBalance()>=amt)
  {
   System.out.println(Thread.currentThread().getName() + "is going to withdraw");
    try
    {
  Thread.sleep(100);
    }
  catch(InterruptedException e)
    {
  System.out.println(e);
    }
 act.withdraw(amt);
   
  System.out.println(Thread.currentThread().getName() + "completes the withdrawwl");
   
  }
 else
  {
  System.out.println("not enough in account for"+ Thread.currentThread().getName() + "to withdrawl: " + act.getBalance());
  }
 }
}
class Account
{
  private int balance=50;
  public int getBalance()
  {
   return balance;
 }
  public void withdraw(int amount)
  {
  balance=balance-amount;
  }
}