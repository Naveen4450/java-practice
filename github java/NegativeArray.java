nclass NegativeArray
{
	public static void main(String[]args)
	{
		try
		{
			int a[]=new int[-10];
                        System.out.println(a[1]);
		}
		catch(NegativeArraySizeException e)
		{
			e.printStackTrace();
		}
                System.out.println("Negative array example");
	}
}