interface student
{
	void show();
}
interface sports extends student
{
	void print();
}
class test
{
	public void shows()
	{
		System.out.println("in class test");
	}
}
class b extends test implements student 
{
	public void show()
	{
		System.out.println("student interface");
	}
	public void print()
	{
		System.out.println("sports interface");
	}
}
class c extends b
{
	public static void main(String args[])
	{
		c c1=new c();
		c1.show();
		c1.print();
	}
}