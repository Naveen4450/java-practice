class test
{
	test()
	{
		System.out.println("super class constructor without parameters");
	}
	test (int n)
	{
		System.out.println("n value="+n+" in super class parameterizied constructor");
	}
}
class test1 extends test
{
	test1()
	{
		super();
		System.out.println("sub class constructor without parameters");
	}
	test1(int n)
	{
		super(n);
		System.out.println("sub class constructor with parameters");
	};
}
class superuse
{
	public static void main(String args[])
	{
		test1 t=new test1();
		test1 t1=new test1(20);
	}
} 