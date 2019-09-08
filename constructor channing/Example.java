public class InstanceInitializerBlock()
{
	private int x;
	System.Out.Println("InstanceInitializerBlock:="+x);
	x=8;
	// now constructor creation start
	public InstanceInitializerBlock()
	{
		System.out.println("Constructor:="+x);
	}
	public static void main()
	{
		InstanceInitializerBlock iib=new InstanceInitializerBlock();
		InstanceInitializerBlock iib1=new InstanceInitializerBlock();
		
	}
	
}