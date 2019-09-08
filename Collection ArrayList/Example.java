import java.util.*;
public class Example
{
	public static void main(String args[])
	{
		ArrayList a=new ArrayList(4);
		a.add("Preeti");
		a.add("Kant");
		Iterator it=a.iterator();
		while(it.hasNext())
		System.out.println(it.next());
	}
}
