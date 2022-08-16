import java.util.Scanner;
class arr
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter array size");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("enter elements of array");
		for (int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Elements of array");
		for (int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		for (int i=0;i<n;i++)
		{
			for (int j=i;j<n;j++)
			{
				if (a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("After Sorting");
		for (int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
}
		
			