class stat
{
	static int c;
	static int b;
	public static void fun()
	{
		System.out.println("Static method");
	}
	public stat()
	{
		c++;
	}
	static
	{
		System.out.println("Static block is executed");
	}
	public static void main(String args[])
	{
		System.out.println("no of objects created"+c);
		stat.fun();
		stat m=new stat();
			System.out.println("no of objects created"+c);
	}
}