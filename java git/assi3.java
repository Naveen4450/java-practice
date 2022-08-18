class Parent
{
private
void method1()
{
System.out.println("This is Parent class");
}
}
class Child extends Parent
{
private
 void method2()
{
System.out.println("This is child class");
}
}
class Assignment
{
public static void main(String args[])
{
Parent p=new Parent();
p.method1();
Child c=new Child();
c.method2(); 
}
}