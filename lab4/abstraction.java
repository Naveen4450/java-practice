abstract class shape
{
	abstract void area(int a,int b);
}
class rectangle extends shape
{
	void area(int a,int b)
	{
		System.out.println("Area of rectangle="+a*b);
	}
}
class triangle extends shape
{
	void area(int a,int b)
	{
		System.out.println("Area of triangle="+(0.5*a*b));
	}
}
class abstraction
{
	public static void main(String args[])
	{
		triangle t=new triangle();
		t.area(10,3);
		rectangle r=new rectangle();
		r.area(3,2);
	}
}