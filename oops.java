import java.io.*;
import java.util.*;
class One
{
	void overRide()
	{
		System.out.println("OverRidding in Class One:");
	}
	void addOne(int a,int b)
	{
		System.out.println("I am Class One:");
		System.out.println("Method Overloading with 2 arg in Class One:"+(a+b));
	}
	void addOne(int a,int b,int c)
	{
		System.out.println("Method Overloading with 3 arg in Class One:"+(a+b+c));
	}
	void addOne(String str)
	{
		System.out.println("Method Overloading with String arg in Class One :: My name is: "+str);
	}
}
class Two extends One
{
	void addTwo()
	{
		System.out.println("I am Class Two:");
	}
	void overRide()
	{
		System.out.println("OverRidding in Class Two:");
	}
}
class Three extends Two
{
	void addThree()
	{
		System.out.println("I am Class Three:");
	}
}
interface InterfaceOne
{
	void add();
}
interface InterfaceTwo
{
	void sub();
}
class InterfaceClass implements InterfaceOne,InterfaceTwo
{
	public void add()
	{
		System.out.println("I am Interface add method:");
	}
	public void sub()
	{
		System.out.println("I am Interface sub method:");
	}
}
class EPAMTask
{
public static void main(String arg[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a,b,c Values:");
	int a=s.nextInt();
	int b=s.nextInt();
	int c=s.nextInt(); 
	System.out.println("Enter Ur Name:");
	String str=s.next();
	Three obj=new Three();
	obj.addOne(a,b);
	obj.addOne(a,b,c);
	obj.addOne(str);
	obj.overRide();
	obj.addTwo();
	obj.addThree();
	InterfaceClass obj1=new InterfaceClass();
	obj1.add();
	obj1.sub();
}
}
