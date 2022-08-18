import java.util.Scanner;
class matrix
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter rows of first matrix");
		int m=s.nextInt();
		System.out.println("Enter columns of first matrix");
		int n=s.nextInt();
		int [][]a=new int[m][n];
		for (int i=0;i<m;i++)
		{
			for (int j=0;j<n;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("Enter rows of second matrix");
		int p=s.nextInt();
		System.out.println("Enter columns of second matrix");
		int q=s.nextInt();
		int [][]b=new int[p][q];
		for (int i=0;i<p;i++)
		{
			for (int j=0;j<q;j++)
			{
				b[i][j]=s.nextInt();
			}
		}
		if (m==p && n==q)
		{
			for (int i=0;i<m;i++)
			{
				for (int j=0;j<n;j++)
					a[i][j]=a[i][j]+b[i][j];
			}
		}
		else
			System.out.println("Addition is not possible");
		System.out.println("After adding");
		for (int i=0;i<m;i++)
			{
				for (int j=0;j<n;j++)
					System.out.print(a[i][j]+" ");
				System.out.print("\n");
			}
		
	}
}