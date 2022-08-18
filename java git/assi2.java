class Parent
{
private method()
{
System.out.println("This is Parent class");
}
}
class Child extends Parent
{
private method()
{
System.out.println("This is child class");
}
}
class Assignment
{
public static void main(String args[])
{
Parent p=new Parent();
p.method();
Child c=new Child();
c.method();
}
}