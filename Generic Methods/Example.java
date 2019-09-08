public class Example
{
	public void printArray(String []s)
	{
		for(int i=0;i<s.length;i++)
		System.out.println(s[i]);
	}

		public static void main(String args[])
		{
			Example e=new Example();
			String s[]=new String[]{"preeti","Kamal","Neelam","Nidhi"};
			e.printArray(s);
		}
}