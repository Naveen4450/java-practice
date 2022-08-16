import java.util.Scanner;
class linsearch
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
		System.out.println("enter element to be searched");
		int x=s.nextInt();
		for (int i=0;i<n;i++)
		{
			if (x==a[i])
			{
				System.out.println(x+" is found at "+i);
				c++;
			}	
		}
		if (c==0)
			System.out.println(x+" is not  found");
	}
}