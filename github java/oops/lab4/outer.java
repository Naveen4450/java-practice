class outer
{
	private int a=10;
	class inner
	{
		void some()
		{
			System.out.println("data="+a);
		}
	}
	public static void main(String args[])
	{
		outer obj=new outer();
		outer.inner in=obj.new inner();
		in.some();
	}
}