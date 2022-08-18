import java.util.Scanner;
class arrsum
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=s.nextInt();
		float su=0;
		int a[]=new int[n];
		System.out.println("Enter elements");
		for (int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			su=su+a[i];
		}
		System.out.println("total sum="+(int)su);
		System.out.println("avergae="+su/n);
	}
}
		