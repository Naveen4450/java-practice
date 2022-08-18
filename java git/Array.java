import java.io.*;
import java.lang.*;
import java.util.Scanner;
class Array
{
public static void main(String args[])
{
int i,n;
System.out.println("enter no of elements:");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int [] a=new int [n];
System.out.println("enter elements");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println("the elements you entered are:");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
int k,j;
for (k=0;k<n-1;k++)
{
for(j=0;j<n-k-1;j++)
{
if(a[j]>a[j+1])
{
int temp;
temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
System.out.println("after sorting");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
for(i=0;i<n;i++){

System.out.println("the small number is"+a[0]);
break;}
for(i=0;i<n;i++){
System.out.println("the big number is"+a[n-1]);
break;
}
}
}