class cmd
{
	public static void main(String args[])
	{
		System.out.println("n="+args[0]);
		int n=Integer.parseInt(args[0]);
		for (int i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+(n*i));
		}
	}
}