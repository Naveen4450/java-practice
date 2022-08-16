class human
{
	public human()
	{
		System.out.println("in class humans");
	}
}
class people extends human
{
	public people()
	{
		System.out.println("in class people");
	}
	public static void main(String args[])
	{
		people 	p=new people();
	}
}