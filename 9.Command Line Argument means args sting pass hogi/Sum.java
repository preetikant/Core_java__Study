class Sum
{
	public static void main(String args[])
	{
		int fact=1;
		for(int i=1;i<args.length;i++)
		fact=fact*Integer.parseInt(args[i]);
		System.out.println("fact="+fact);
	}
}