class Test
{
	int fact=1;
	public void setDimension(int i)
	{
		for(int j=1;j<=i;j++)
		fact=fact*j;
	}
	public void showDimension()
	{
		System.out.println("fact of is "+fact);
	}

}
class Fact
{
	public static void main(String args[])
	{
		Test t=new Test();
		t.setDimension(Integer.parseInt(args[i]));
		t.showDimension();
		
	}
}