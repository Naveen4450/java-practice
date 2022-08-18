interface a
{
	void display();
}
interface b
{
	void callme();
}
interface c extends a,b
{
	void callme();
}
class d implements c
{
	public void callme()
	{
		System.out.println("call me function executed");
	}
	public void display()
	{
		System.out.println("display function executed");
	}
	public static void main(String args[])
	{
		d d1=new d();
		d1.callme();
		d1.display();
	}
}