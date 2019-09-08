class A
{
	int a;
	public A(int x)
	{
		a=x;
		System.out.println("a="+a);
	}
}
class B extends A
{
	 int b;
	public B()
	{
		super(5);
		System.out.println("B");
	}
}
class Example
{
	public static void main(String args[])
	{
		B obj=new B();
	}
}
