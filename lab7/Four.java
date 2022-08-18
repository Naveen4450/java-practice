package p3;
import java.util.*;
import math.func.*;
public class Four
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter value:");
		int i=s.nextInt();
		Fact f=new Fact();
		f.fact(i);
		Square sq=new Square();
		sq.squ(i);
		Cube c=new Cube();
		c.cub(i);
	}
}