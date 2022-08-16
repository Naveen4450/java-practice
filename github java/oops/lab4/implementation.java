interface a
{
	void display();
}
class b implements a
{
	public void display()
	{
		System.out.println("class b implements interface a");
	}
}
class c implements a
{
	public void display()
	{
		System.out.println("class c implements interface a");
	}
}
class implementation
{
	public static void main(String args[])
	{
		b b1=new b();
		b1.display();
		c c1=new c();
		c1.display();
	}
}