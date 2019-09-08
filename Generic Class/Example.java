class Hello<T>
{
	T i;
	public void add(T i1)
		{
			i=i1;
		}
	public T get()
		{
			return(i);
		}
}
public class Example
{
	public static void main(String args[])
	{
		Hello<Integer> h1=new Hello<Integer>();
		Hello<String> h2=new Hello<String>();
		Integer n=new Integer(4);
		h1.add(n);
		h2.add("Preeti");
		System.out.println("h1= "+h1.get()+" "+"h2= "+h2.get());
	}

}