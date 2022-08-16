import java.util.Scanner;
class maxi
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter array size");
		int n=s.nextInt();
		int []a=new int[n];
		int max=0;
		for (int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			if (a[i]>max)
				max=a[i];
		}
		System.out.println("maximum element="+max);
	}
}