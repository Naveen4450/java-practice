package math.func;
public class Fact
{
	public void fact(int n)
	{
		int f=1;
		for(int i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println("Factorial:"+f);
	}
}