interface printable
{
	void print();
}
class a implements printable
{
	public void print()
	{
		System.out.println("in class a");
	}
}
class b extends a
{
	public void show()
	{
		System.out.println("in class b");
	}
	public static void main(String args[])
	{
		b b1=new b();
		b1.print();
		b1.show();
	}
	
}