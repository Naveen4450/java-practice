import java.util.Scanner;
import java.lang.Math;
class palindrome
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=s.nextInt();
		int k=n,c=0,r,su=0;
		while (n>0)
		{
			c++;
			n=n/10;
		}
		n=k;
		while (c>0)
		{
			r=n%10;
			su=su+(r*(int)Math.pow(10,c-1));
			c--;
			n=n/10;
		}
		if (k==su)
			System.out.println(k+" is palindrome");
		else	
			System.out.println(k+" is not palindrome");
	}
}