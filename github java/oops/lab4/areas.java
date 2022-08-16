import java.lang.Math;
import java.util.Scanner;
class areas
{
	public void area(int n)
	{
		System.out.println("Area of circle ="+((Math.PI)*Math.pow(n,2)));
	}
	public void area(int a1,int b)
	{
		System.out.println("Area of rectangle ="+(a1*b));
	}
	public void area(double a1,int b,int c)
	{
		System.out.println("Area of triangle ="+(a1)*(b)*(c));
	}
	public static void main(String args[])
	{
		areas a =new areas();
		System.out.println("1.area of circle");
		System.out.println("2.area of rectangle");
		System.out.println("3.area of triangle");
		Scanner s=new Scanner(System.in);
		System.out.println("enter your choice");
		int n=s.nextInt();
		if (n==1)
			a.area(2);
		if (n==2)
			a.area(2,3);
		if (n==3)
			a.area(0.5,2,3);
	}

}