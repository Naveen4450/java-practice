import java.util.Scanner;
class Test
{

		int a,b;
	public void get()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a and b values");
		a=s.nextInt();
		b=s.nextInt();
	}
	public void show()
	{
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	public static void main(String args[])
	{
		Test t=new Test();
		t.get();
		t.show();
	}
}
