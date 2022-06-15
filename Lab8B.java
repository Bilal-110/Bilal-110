public class Lab8B
{
public static void main(String args [])
{
A P=new A();
P.display();
}
}

class Addition
{
void add ()
{
System.out.println("parent class add method");
}
}

class A extends Addition
{
void add()
{
System.out.println("child class add method");
}
void display()
{
super.add();
}
}


