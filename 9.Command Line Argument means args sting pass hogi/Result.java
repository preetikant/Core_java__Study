class Area
{
	//int l,b,h;
	float Area;
	public void setDimension(int l, int b, int h)
	{
	 Area=l*b*h;
	}
	public void showDimension()
	{
		System.out.println("Area="+Area);
		
	}
	
}
class Result
{
	public static void main(String args[])
	{
	 Area a = new Area();
	 a.setDimension(10,2,3);
	 a.showDimension();
	}
}