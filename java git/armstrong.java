import java.util.Scanner;
import java.lang.*;
import java.io.*;
class armstrong
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n,i,c=0,on,temp,rem;
	double sum=0;
	System.out.println("Enter a  number");
	n=sc.nextInt();
	on=temp=n;
	while(n>0)
	{c++;
	n=n/10;}
	while(on>0)
	{
		rem=on%10;
		sum=(sum*10)+(Math.pow(rem,c));
		on=on/10;
	}
	if(sum==temp)
	System.out.println("given no is armstrong"+sum);
	else
	System.out.println("not armstrong");
	
}
}