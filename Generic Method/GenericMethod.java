public class GenericMethod
{
	public <E> void printArray(E a[])
	{
		for(E x:a)
		System.out.println(" "+x);
	}
	public static void main(String args[])
	{
		GenericMethod gm=new GenericMethod();
		String s[]=new String[]{"Preeti","Neelam","kamal","Nidhi"};
		Integer n[]={32,32,89,44,2};
		gm.printArray(s);
		gm.printArray(n);
	}
}