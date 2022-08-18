import java.util.Scanner;
class matmul
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
		int [][]c=new int [m][q];
		if (n==p)
		{
			for (int i=0;i<m;i++)
			{
				for (int j=0;j<q;j++)
				{
					for (int k=0;k<m;k++)
						c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		else
			System.out.println("multiplication is not possible");
		for (int i=0;i<m;i++)
		{
			for (int j=0;j<q;j++)
				System.out.print(c[i][j]+" ");
			System.out.print("\n");
		}
	}
}