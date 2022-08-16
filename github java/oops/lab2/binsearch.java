import java.util.Scanner;
class binsearch
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter array size");
		int n=s.nextInt();
		int []a=new int[n];
		int c=0;
		System.out.println("enter elements");
		for (int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int s1=0,e=n;
		System.out.println("enter element to be searched");
		int x=s.nextInt();
		int m=(s1+e)/2;
		while (s1<=e)
		{
			 m=(s1+e)/2;
			if (x==a[m])
			{
				System.out.println("found at "+m+" position");
				break;
			}
			else if (x>a[m])
				s1=m+1;
			else
				e=m-1;
		}
	}
}