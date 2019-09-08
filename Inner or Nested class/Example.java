class Outer
{
	class Inner
	{
		void if1()
		{
			System.out.println("if1()");
		}
	}
}
public class Example
{
	public static void main(String args[])
	{
		Outer o=new Outer();
		Outer.Inner o1=o.new Inner();
		o1.if1();
	}
}