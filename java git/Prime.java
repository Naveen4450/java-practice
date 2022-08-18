//prime numbers odd numbers even numbers between 1 to 100
import java.util.Scanner;
Class Prime
{
public static void main(String args[])
{
int i,j,c=0;
for(i=1;i<=100;i++)
{
for(j=2;j<=i/2;j++)
{
if(i%j==0)
c++;
}
if(c==0)
System.out.println(i);
}

}
}