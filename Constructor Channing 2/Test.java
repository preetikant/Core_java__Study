class A
{
	public A()
	{
		System.out.println("A 1");
	}
}
class B extends A
{
	public B()
	{	
		this(4);
		System.out.println("B 1");
	}
	public B(int x)
	{
		System.out.println("B 2");
	}
}
class Test
{
	public static void main(String ar[])
	{
		B b=new B();
	}
}