class factorial
{
	public static void main(String args[])
	{
		int fact=0,i;
		for(i=0;i<=args.length;i++)
		fact=fact*Integer.parseInt(args[i]);
			System.out.println("factorial of"+args[i]+"is"+fact);
	}
 
}