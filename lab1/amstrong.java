import java.util.Scanner;
import java.lang.Math;
class amstrong
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int n=s.nextInt();
		int k=n,c=0,su=0;
		while (n>0)
		{
			c++;
			n=n/10;
		}
		n=k;
		while (n>0)
		{
			int r=n%10;
			su=su+((int)Math.pow(r,c));
			n=n/10;
		}
		if (su==k)
		{
			System.out.println(k+" is amstrong");
		}
		else
			System.out.println(k+" is not amstrong");
	}
} 