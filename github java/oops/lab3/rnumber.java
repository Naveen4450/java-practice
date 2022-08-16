import java.util.Scanner;
import java.util.Random;
class rnumber
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter lowbound");
		int n1=s.nextInt();
		System.out.println("enter upperbound");
		int n2=s.nextInt();
		Random rn=new Random();
		int r=rn.nextInt((n2-n1)+1)+n1;
		System.out.println("Random number"+r);
	}
}