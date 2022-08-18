import java.util.Scanner;
class Teja
{
public void display()
{
String name;
Scanner sc=new Scanner(System.in);
System.out.println("re");
name=sc.next();
System.out.println("Kiss me"+name);
}
}
class TejesH extends Teja
{
public void show()
{
String say;
Scanner sc=new Scanner(System.in);
System.out.println("ummah");
say=sc.next();
for(int i=0;i<10;i++)
{
System.out.println(say);
}
}
}
public class Haritha
{
public static void main(String args[])
{
TejesH Love= new TejesH();
Love.display();
Love.show();
}
}