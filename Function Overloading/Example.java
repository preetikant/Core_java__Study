class A
{
	void fun1(int a)
	{
		System.out.println("Class A");
	}
}
class B extends A
{
	void fun1(int a,int b)
	{
		System.out.println("Class B");
	}

}
public class Example
{
	public static void main(String args[])
	{
		B b1=new B();
		b1.fun1(8);
		b1.fun1(5,9);
	}
}