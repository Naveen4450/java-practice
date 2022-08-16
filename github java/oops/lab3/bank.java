import java.util.Scanner;
class bank
{
	private int acno;
	private String name;
	private int ifsc;
	public int getifsc()
	{
		return ifsc;
	}
	public int getacno()
	{
		return acno;
	}
	public String getname()
	{
		return name;
	}
	public void setacno(int n)
	{
		this.acno=n;
	}
	public void setname(String na)
	{
		this.name=na;
	}
	public void setifsc(int m)
	{
		this.ifsc=m;
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		bank b=new bank();
		System.out.println("Enter ac number");
		int n=s.nextInt();
		b.setacno(n);
		b.setname("name");
		System.out.println("enter ifsc code");
		int m=s.nextInt();
		b.setifsc(m);
		System.out.println(b.getname());
		System.out.println(b.getacno());
		System.out.println(b.getifsc());
	}
}