import java.util.Scanner;
class fact
{
	public int fac(int n)
	{
		if (n==0 || n==1)
			return 1;
		else	
			return n*fac(n-1);
	}
	public static void main(String args[])
	{
		int n;
		Scanner s=new Scanner(System.in);
		fact f=new fact();
		System.out.println("Enter number");
		n=s.nextInt();
		int fa=f.fac(n);
		System.out.println(fa);
	}
};
		