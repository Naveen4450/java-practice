import java.util.Scanner;
import java.lang.*;
class Employee
{
int hello()
{
String emid,ename;
int sal;
float in,n,fsal;
System.out.println("enter the employee name");
ename=sc.nextLine();
System.out.println(" ");
System.out.println("enter the id of employee");
emid=sc.nextLine();
System.out.println(" ");
System.out.println("enter the salary of employee");
sal=sc.nextInt();
System.out.println("enter the pesentage of salary that should be incremented");
System.out.println(" ");
n=sc.nextFloat();
in=(sal)/n;
fsal=sal+in;
System.out.println("employee name is"+ename);
System.out.println("employee id is"+emid);
System.out.println("salary before increment is "+sal);
System.out.println("salary after increment is"+fsal);
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
hello();
String emid,ename;
int sal;
float in,n,fsal;
System.out.println("enter the employee name");
ename=sc.nextLine();
System.out.println(" ");
System.out.println("enter the id of employee");
emid=sc.nextLine();
System.out.println(" ");
System.out.println("enter the salary of employee");
sal=sc.nextInt();
System.out.println("enter the pesentage of salary that should be incremented");
System.out.println(" ");
n=sc.nextFloat();
in=(sal)/n;
fsal=sal+in;
System.out.println("employee name is"+ename);
System.out.println("employee id is"+emid);
System.out.println("salary before increment is "+sal);
System.out.println("salary after increment is"+fsal);
}
}