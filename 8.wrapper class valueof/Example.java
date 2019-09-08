class Example
{
	public static void main(String ar[])

	{
		// valueOf wrapper class
		Integer i1=Integer.valueOf("1234");
		Float f1=Float.valueOf("3.232");
		System.out.println(i1);
		System.out.println(f1);
		// parseXxx wrapper class
		Integer i2=Integer.parseInt("78980");
			double d3=Double.parseDouble("4.333");
			float f3=Float.parseFloat("3.323");
		//xxxValue wrapper class 
			int i8=i1.intValue();
		System.out.println(i2);
		System.out.println(d3);
		System.out.println(f3);
		System.out.println(i8);
		System.out.println(f1);		
	
		
		
	
	}
}