import java.util.*;
class A{
	public static void main(String []args)
	{
		Vector v=new Vector();
		v.add(20);
		
		v.add(2);
		v.add(0);
		v.add(10);
		System.out.println(v);
		Collections.sort(v);
		System.out.println(v);
		}
}