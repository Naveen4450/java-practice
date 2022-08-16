import java.util.Scanner;
class transpose
{
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter rows of  matrix");
		int m=s.nextInt();
		System.out.println("Enter columns of  matrix");
		int n=s.nextInt();
		int [][]a=new int[m][n];
		int [][]b=new int[m][n];
		System.out.println("Enter elements");
		for (int i=0;i<m;i++)
		{
			for (int j=0;j<n;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("matrix");
		for (int i=0;i<m;i++)
			{
				for (int j=0;j<n;j++)
					System.out.print(a[i][j]+" ");
				System.out.print("\n");
			}
		for (int i=0;i<m;i++)
		{
			for (int j=0;j<n;j++)
			{
				b[i][j]=a[j][i];
			}
		}
		System.out.println("After transposing");
		for (int i=0;i<m;i++)
			{
				for (int j=0;j<n;j++)
					System.out.print(b[i][j]+" ");
				System.out.print("\n");
			}
	}
}