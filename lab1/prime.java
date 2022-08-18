class prime
{
	public static void main(String args[])
	{
		int i=1;
		for (i=2;i<100;i++)
		{	
			int c=0;
			for (int j=2;j<i;j++)
			{
				if (i%j==0)
					c++;
			}
			if (c==0)
			{
				if (i%2==0)
					System.out.println(i+"->evenprime");
				else
					System.out.println(i);
			}
				
		}
	}
}