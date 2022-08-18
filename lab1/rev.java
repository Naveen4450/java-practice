import java.util.Scanner;
class rev
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String str=s.nextLine();
		StringBuilder r=new StringBuilder();
		r.append(str);
		r.reverse();
		System.out.println(r);
	}
}
		