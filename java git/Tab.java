import java.util.Scanner;
import java.io.*;
import java.lang.*;
class Tab
{
public static void main(String args[])
{
int n,i;
System.out.println("enter the table you want");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
System.out.println("the reqired table is");
for(i=1;i<=10;i++)
{
System.out.println(n+"*"+i+"="+(n*i));
}

}
}