import java.util.Scanner;
class employee
{
	Scanner s=new Scanner(System.in);
	int empid;
	String ename=s.nextLine();
	int sal;
	
	public void some()
	{
		System.out.println("enter employee id");
		empid=s.nextInt();
		System.out.println("enter employee salary");
		sal=s.nextInt();
	}
	public void incre()
	{
		sal=sal+(10*sal)/100;
	}
	public void display()
	{
		System.out.println("employee id:"+empid);
		System.out.println("employee name:"+ename);
		System.out.println("employee salary:"+sal);
	}
	public static void main(String args[])
	{
		Scanner p=new Scanner(System.in);
		System.out.println("enter no of employees");
		int n=p.nextInt();
		employee e[]=new employee[n];
		for (int i=0;i<n;i++)
		{
			e[i]=new employee();
		}
		for (int i=0;i<n;i++)
		{
			e[i].some();
		}
		for (int i=0;i<n;i++)
		{
			e[i].display();
		}	
		for (int i=0;i<n;i++)
		{
			e[i].incre();
		}
		System.out.println("After incrementing salary by 10 percent");
		for (int i=0;i<n;i++)
		{
			e[i].display();
		}
	}
}
		
		
		