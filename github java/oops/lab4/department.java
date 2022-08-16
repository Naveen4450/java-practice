class university
{
	university()
	{
		System.out.println("in class university");
	}
}
class college extends university
{
	college()
	{
		System.out.println("in class college");
	}
}
class department extends college
{
	department()
	{
		System.out.println("in class department");
	}
	public static void main(String args[])
	{
		department d=new department();
	}
}