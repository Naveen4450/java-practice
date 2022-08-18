class Assignment
{
class Parent
{
 void method()
{
System.out.println("this is pareent class");
}
}
class Child extend Parent
{
void method2()
{
System.out.println("this is child class");
}
}
public static void main(String args[])
{
Parent p = new Parent();
p.method();
}
}